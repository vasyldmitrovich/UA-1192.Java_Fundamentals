package com.softserve.edu4.pt;

public class Product {

    private String name;
    private double price;
    private int quantity;

    Product() {
        this.name = "Laptop";
        this.price = 8500.99;
        this.quantity = 3;
    }

    Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
