package com.softserve.edu04.pt;

public class Product {
    String name;
    double price;
    int quantity;
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    private static Product getMostExpensiveP(Product p1, Product p2, Product p3, Product p4){
        Product mostExpensiveP = p1;
        double costOfExpensiveP = Math.max(p1.price, Math.max(p2.price, Math.max(p3.price, p4.price)));
        if (costOfExpensiveP == p1.getPrice()){
            mostExpensiveP = p1;
        } if (costOfExpensiveP == p2.getPrice()){
            mostExpensiveP = p2;
        } if (costOfExpensiveP == p3.getPrice()) {
            mostExpensiveP = p3;
        } if (costOfExpensiveP == p4.getPrice()){
            mostExpensiveP = p4;
        } return mostExpensiveP;
    }
    private static Product getBiggestQuantityP(Product p1, Product p2, Product p3, Product p4){
        Product biggestQuantityP = p1;
        int biggestQuantity = Math.max(p1.quantity, Math.max(p2.quantity, Math.max(p3.quantity, p4.quantity)));
        if (biggestQuantity == p1.getQuantity()) {
            biggestQuantityP = p1;
        } if (biggestQuantity == p2.getQuantity()) {
            biggestQuantityP = p2;
        } if (biggestQuantity == p3.getQuantity()){
            biggestQuantityP = p3;
        } if (biggestQuantity == p4.getQuantity()) {
            biggestQuantityP = p4;
        } return biggestQuantityP;
    }

    public static void main(String[] args) {
       Product p1 = new Product("Phone", 1200.50, 36);
       Product p2 = new Product("Laptop", 2000.23, 32);
       Product p3 = new Product("Headphones", 500.12, 28);
       Product p4 = new Product("Keyboard",320.99,78);
       Product mostExpensiveP = getMostExpensiveP(p1, p2, p3, p4);
       Product biggestQuantityP = getBiggestQuantityP(p1, p2, p3, p4);

        System.out.println("Most expensive item: " + mostExpensiveP.name + ", quantity: " + mostExpensiveP.quantity);
        System.out.println("Items with the biggest quantity: " + biggestQuantityP.name);
    }
}
