package com.softserve.edu04.pt;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static final Scanner SC = new Scanner(System.in);
    public static final String DELIMITER = " ";

    public static void main(String[] args) {// Very, very nice
        System.out.println("Task 1");
        demonstrateOddTask();
        System.out.println();
        System.out.println("Task 2");
        demonstrateDayOfWeekTask();
        System.out.println();
        System.out.println("Task 3");
        demonstrateContinentTask();
        System.out.println();
        System.out.println("Task 4");
        demonstrateProductsTask();
    }

    public static void demonstrateOddTask() {
        System.out.print("Input three numbers by space: ");
        String input = SC.nextLine();
        int[] odds = OddEvenUtil.getOdds(input, DELIMITER);
        System.out.printf("There are %d odd numbers: %s%n",
                odds.length, Arrays.toString(odds));
    }

    public static void demonstrateDayOfWeekTask() {
        System.out.print("Input day's number of week: ");
        int position = Integer.parseInt(SC.nextLine());
        DayOfWeek day = DayOfWeek.of(position);
        System.out.printf("Day of week with position %d is: %s/%s%n",
                position, day.getEnglish(), day.getUkrName());
    }

    public static void demonstrateContinentTask() {
        System.out.print("Input country's name: ");
        String name = SC.nextLine();
        Continent continent = Continent.of(name);
        if (continent == null) {
            System.out.println("Sorry, selected country isn't supported yet...");
        } else {
            System.out.printf("Selected country '%s' is located on %s%n", name, continent);
        }
    }

    public static void demonstrateProductsTask() {
        Product[] products = new Product[4];
        System.out.print("Input info about 1st Product (name, price, quantity) by space: ");
        products[0] = new Product(SC.nextLine(), DELIMITER);
        System.out.print("Input info about 2nd Product (name, price, quantity) by space: ");
        products[1] = new Product(SC.nextLine(), DELIMITER);
        System.out.print("Input info about 3rd Product (name, price, quantity) by space: ");
        products[2] = new Product(SC.nextLine(), DELIMITER);
        System.out.print("Input info about 4th Product (name, price, quantity) by space: ");
        products[3] = new Product(SC.nextLine(), DELIMITER);

        System.out.println("The most expensive products: ");
        double biggestPrice = Product.getBiggestPrice(products);
        for (Product product : products) {
            if (product.getPrice() == biggestPrice) {
                System.out.println(product);
            }
        }

        System.out.println("The biggest quantity of: ");
        int biggestQuantity = Product.getBiggestQuantity(products);
        for (Product product : products) {
            if (product.getQuantity() == biggestQuantity) {
                System.out.printf("Name='%s'%n", product.getName());
            }
        }
    }
}
