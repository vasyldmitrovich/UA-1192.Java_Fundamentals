package com.softserve.edu04.pt;

import java.util.Objects;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int quantity;


    public  Product (){

    }

    public Product(String name,double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    /*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }*/
}
