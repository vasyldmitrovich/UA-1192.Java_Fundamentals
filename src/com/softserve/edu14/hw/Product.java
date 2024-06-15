package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Product {
    private String manufactureCategory;
    private LocalDate manufactureDate;
    private int price;

    public Product(){}

    public Product(String cat, LocalDate date, int price){
        this.manufactureCategory = cat;
        this.manufactureDate = date;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Product createRandom(){
        Random random = new Random();
        String[] categories = new String[]{"Laptop", "Speaker", "Phone", "Camera"};
        LocalDate date = LocalDate.of(random.nextInt(2018, 2024), random.nextInt(1,12), random.nextInt(1, 28));
        int price = random.nextInt(2000, 30000);

        return new Product(categories[random.nextInt(0,3)], date, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(manufactureCategory, product.manufactureCategory) && Objects.equals(manufactureDate, product.manufactureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureCategory, manufactureDate, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }
}
