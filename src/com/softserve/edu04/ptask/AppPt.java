package com.softserve.edu04.ptask;

import java.io.IOException;
import java.util.Scanner;

public class AppPt {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int count = 0;
        if (num1 % 2 != 0) {
            count++;
        }
        if (num2 % 2 != 0) {
            count++;
        }

        if (num3 % 2 != 0) {
            count++;
        }

        System.out.println("There are " + count + " odd numbers");
    }

    public static void task2() {
        System.out.println("Enter the number of a day of a week: ");
        int dayNum = scan.nextInt();

        DayOfWeek dayOfWeek = DayOfWeek.getNumber(dayNum);

        System.out.println("This number corresponds to: " + dayOfWeek.engName);

        System.out.println("Цей номер відповідає дню: " + dayOfWeek.ukrName);
    }

    public static void task3() {
        System.out.println("Enter country name: ");
        String country = scan.nextLine();

        Continent continent = Continent.getForCountry(country);

        System.out.println("Country named " + country + " belongs to " + continent);
    }

    public static void task4() {
        Product product1 = new Product("Dress", 1000, 5);

        Product product2 = new Product("T-shirt", 400, 10);

        Product product3 = new Product("Pants", 800, 5);

        Product product4 = new Product("Skirt", 500, 5);

        Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }

        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }

        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }

        System.out.println("The most expencive product is:\n" +
                " name = " + mostExpensive.getName() + "\n" +
                " quantity = " + mostExpensive.getQuantity());

        int maxQuantity = product1.getQuantity();

        if (product2.getQuantity() > maxQuantity) {
            maxQuantity = product2.getQuantity();
        }

        if (product3.getQuantity() > maxQuantity) {
            maxQuantity = product3.getQuantity();
        }

        if (product4.getQuantity() > maxQuantity) {
            maxQuantity = product4.getQuantity();
        }

        System.out.println("The products with max quantity of " + maxQuantity +
                " are the following: ");

        if (product1.getQuantity() == maxQuantity) {
            System.out.println(product1.getName());
        }

        if (product2.getQuantity() == maxQuantity) {
            System.out.println(product2.getName());
        }

        if (product3.getQuantity() == maxQuantity) {
            System.out.println(product3.getName());
        }

        if (product4.getQuantity() == maxQuantity) {
            System.out.println(product4.getName());
        }
    }
}


