package com.softserve.edu04.pt;

import java.util.Scanner;

public class App {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//       App.task1 ();
//        App.task2();
//        App.task3();
        task4();

    }

    public static void task1() {
        System.out.print("Input first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Input second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Input third number: ");
        double number3 = scanner.nextDouble();

        int count = 0;
        if (number1 % 2 != 0) {
            count++;
        }
        if (number2 % 2 != 0) {
            count++;
        }
        if (number3 % 2 != 0) {
            count++;
        }

        System.out.println("Number of odd is: " + count);

    }

    public static void task2() {
        System.out.print("Input the number of the day of the week: ");
        int dayOfWeek = scanner.nextInt();
        String result;

        switch (dayOfWeek) {
            case 1:
                result = "Monday, Полнеділок";
                break;
            case 2:
                result = "Tuesday, Вівторок";
                break;
            case 3:
                result = "Wednesday, Середа";
                break;
            case 4:
                result = "Thursday, Четвер";
                break;
            case 5:
                result = "Friday, П'ятниця";
                break;
            case 6:
                result = "Saturday, Субота";
                break;
            case 7:
                result = "Sunday, Неділя";
                break;
            default:
                result = "Wrong number";

        }
        System.out.println(result);
    }

    public static void task3() {
        Continents continents;

        System.out.print("Input the name of country: ");
        String country = scanner.nextLine();

        continents = switch (country) {
            case "Ukraine", "Poland" -> Continents.Eurasia;
            case "USA", "Canada" -> Continents.North_America;
            case "Brazil" -> Continents.South_America;
            case "SAR" -> Continents.Africa;
            case "Australia" -> Continents.Australia;
            default -> Continents.Undefined;
        };
        System.out.println("The names of continent of " + country + " is " + continents);
    }

    public static void task4(){
        Product product1 = new Product("Phone", 250.0, 12);
        Product product2 = new Product("Comp", 1100.0, 5);
        Product product3 = new Product("Sub", 120.0, 6);
        Product product4 = new Product("Keyboard", 20.0, 30);

        Product mostExpensive = getMostExpensive(product1, product2, product3, product4);
        Product bigQuantity = getBigQuantity(product1, product2, product3, product4);

        System.out.println("Most expensive product is: " + mostExpensive.getName() + " and it quantity is: " + mostExpensive.getQuantity());
        System.out.println("The biggest quantity is: " + bigQuantity.getQuantity() + " of product: " + bigQuantity.getName());
    }

    private static Product getMostExpensive(Product product1, Product product2, Product product3, Product product4) {
        Product mostExpensive = product1;
        double priceExpensive = Math.max(product1.getPrice(), Math.max(product2.getPrice(), Math.max(product3.getPrice(), product4.getPrice())));
        if (priceExpensive == product1.getPrice()) {
            mostExpensive = product1;
        }
        if (priceExpensive == product2.getPrice()) {
            mostExpensive = product2;
        }
        if (priceExpensive == product3.getPrice()) {
            mostExpensive = product3;
        }
        if (priceExpensive == product4.getPrice()) {
            mostExpensive = product4;
        }
        return mostExpensive;
    }

    private static Product getBigQuantity(Product product1, Product product2, Product product3, Product product4) {
        Product bigQuantity = product1;
        int bigQuant = Math.max(product1.getQuantity(), Math.max(product2.getQuantity(), Math.max(product3.getQuantity(), product4.getQuantity())));
        if (bigQuant == product1.getQuantity()) {
            bigQuantity = product1;
        }
        if (bigQuant == product2.getQuantity()) {
            bigQuantity = product2;
        }
        if (bigQuant == product3.getQuantity()) {
            bigQuantity = product3;
        }
        if (bigQuant == product4.getQuantity()) {
            bigQuantity = product4;
        }
        return bigQuantity;
    }
}
