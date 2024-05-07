package edu04;



public class Product {
    private String name;
    private double price;
    private int quantity;

    public static double getBiggestPrice(Product... products) {
        double biggestPrice = products[0].price;

        for (int i = 0; i < products.length; i++) {
            if (products[i].price > biggestPrice) {
                biggestPrice = products[i].price;
            }
        }
        return biggestPrice;
    }

    public static int getBiggestQuantity(Product... products) {
        int biggestQuantity = products[0].quantity;

        for (int i = 1; i < products.length; i++) {
            if (products[i].quantity > biggestQuantity) {
                biggestQuantity = products[i].quantity;
            }
        }
        return biggestQuantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String prompt, String delimiter) {
        String[] values = prompt.split(delimiter);
        this.name = values[0];
        this.price = Double.parseDouble(values[1]);
        this.quantity = Integer.parseInt(values[2]);
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

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                "; Quantity=" + quantity;
    }
}


