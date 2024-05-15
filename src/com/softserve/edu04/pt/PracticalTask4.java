package com.softserve.edu04.pt;

import java.util.Scanner;

public class PracticalTask4 {

    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;

    PracticalTask4() {
        this.product1 = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the product");
        String name = sc.nextLine();
        System.out.println("Enter the price of the product");
        double price = 0;
        int quantity = 0;
        try {
            price = sc.nextDouble();
            System.out.println("Enter the quantity of product");
            quantity = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
            System.exit(0);
        }
        this.product2 = new Product(name, price, quantity);
        sc.nextLine();
        System.out.println("Enter the name of the product");
        name = sc.nextLine();
        System.out.println("Enter the price of the product");
        try {
            price = sc.nextDouble();
            System.out.println("Enter the quantity of product");
            quantity = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
            System.exit(0);
        }
        this.product3 = new Product(name, price, quantity);
        sc.nextLine();
        System.out.println("Enter the name of the product");
        name = sc.nextLine();
        System.out.println("Enter the price of the product");
        try {
            price = sc.nextDouble();
            System.out.println("Enter the quantity of product");
            quantity = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
            System.exit(0);
        }
        this.product4 = new Product(name, price, quantity);
    }

    public void start() {
        if ((this.product1.getPrice() >= this.product2.getPrice()) &&
                (this.product1.getPrice() >= this.product3.getPrice()) &&
                (this.product1.getPrice() >= this.product4.getPrice())) {
            System.out.println ("Most expensive product is " + this.product1.getName() + " with quantity of "
                    + this.product1.getQuantity());
        } else if ((this.product2.getPrice() >= this.product3.getPrice()) &&
                (this.product2.getPrice() >= this.product4.getPrice())) {
            System.out.println ("Most expensive product is " + this.product2.getName() + " with quantity of "
                    + this.product2.getQuantity());
        } else if ((this.product3.getPrice() >= this.product4.getPrice())) {
            System.out.println ("Most expensive product is " + this.product3.getName() + " with quantity of "
                    + this.product3.getQuantity());
        } else {
            System.out.println ("Most expensive product is " + this.product4.getName() + " with quantity of "
                    + this.product4.getQuantity());
        }
        int biggestQuantity = product1.getQuantity();
        if (biggestQuantity < product2.getQuantity()) {
            biggestQuantity = product2.getQuantity();
        } else if (biggestQuantity < product3.getQuantity()) {
            biggestQuantity = product3.getQuantity();
        } else if (biggestQuantity < product4.getQuantity()) {
            biggestQuantity = product4.getQuantity();
        }

        if (biggestQuantity == product1.getQuantity()) {
            System.out.println(product1.getName() + " has biggest quantity");
        }
        if (biggestQuantity == product2.getQuantity()) {
            System.out.println(product2.getName() + " has biggest quantity");
        }
        if (biggestQuantity == product3.getQuantity()) {
            System.out.println(product3.getName() + " has biggest quantity");
        }
        if (biggestQuantity == product4.getQuantity()) {
            System.out.println(product4.getName() + " has biggest quantity");
        }
    }
}
