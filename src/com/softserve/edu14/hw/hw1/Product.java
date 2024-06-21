package com.softserve.edu14.hw.hw1;

import java.time.LocalDate;

public class Product {
    public String manufacturer;
    public String category;
    public LocalDate manufactureDate;
    public double price;

    public Product(String manufacturer, String category, LocalDate manufactureDate, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: " + "manufacturer: '" + manufacturer + '\'' + ", category: '" + category + '\'' + ", manufactureDate:" + manufactureDate + ", price: " + price;
    }
}
