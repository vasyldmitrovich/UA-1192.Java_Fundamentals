package com.softserve.edu14.hw;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Product {

    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product () {
        this.category = "Phone";
        this.dateOfManufacture = LocalDate.of(2024, 1, 12);
        this.price = 5699.90;
    }

    public Product(String category, LocalDate dateOfManufacture, double price) {
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Product{" +
                "category='" + category + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + df.format(price) +
                '}';
    }
}
