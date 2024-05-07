package com.softserve.edu04.pt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { // All is good but make code more readable, add spaces
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Input first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Input second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Input third number: ");
        double number3 = scanner.nextDouble();

        int counter = 0;
        if (number1 % 2 != 0) {
            counter++;
        }
        if (number2 % 2 != 0) {
            counter++;
        }
        if (number3 % 2 != 0) {
            counter++;
        }

        System.out.println("Quantity of odd numbers is: " + counter);
    }

    public static void task2() {
        System.out.println("Input number of the week day: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1: System.out.println("Monday\nПолнеділок");break;
            case 2: System.out.println("Tuesday\nВівторок");break;
            case 3: System.out.println("Wednesday\nСереда");break;
            case 4: System.out.println("Thursday\nЧетвер");break;
            case 5: System.out.println("Friday\nП'ятниця");break;
            case 6: System.out.println("Saturday\nСубота");break;
            case 7: System.out.println("Sunday\nНеділя");break;
            default: System.out.println("Unknown day");
        }
    }// Nice

    public static void task3() {
        System.out.println("Input name of country");
        String country = scanner.nextLine();

        Continent continent = getContinent(country);

        if (continent != null) {
            System.out.println("Country " + country + " situated in " + continent);
        } else {
            System.out.println("Can`t determine continent for " + country);
        }
    }

    public static void task4() {
        Product fork = new Product("Fork", 19.4, 100);
        Product spoon = new Product("Spoon", 18, 200);
        Product pan = new Product("Pan", 50.5, 23);
        Product fryingPan = new Product("Frying pan", 60.1, 111);

        List<Product> products = Arrays.asList(fork, spoon, pan, fryingPan);

        Product productWithHighestPrice = products.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);

        System.out.println("Product with highest price is: " + productWithHighestPrice.getName() +
                ", price: " + productWithHighestPrice.getPrice());

        Product productWithBiggestQuantity = products.stream()
                .max(Comparator.comparingInt(Product::getQuantity))
                .orElse(null);

        System.out.println("Product with biggest quantity is: " + productWithBiggestQuantity.getName());
    }

    public static Continent getContinent(String country) {
        return switch (country) {
            case "Ukraine", "France", "Germany" -> Continent.EUROPE;
            case "China", "Japan", "India" -> Continent.ASIA;
            case "Egypt", "Nigeria", "South Africa" -> Continent.AFRICA;
            case "USA", "Canada", "Mexico" -> Continent.NORTH_AMERICA;
            case "Brazil", "Argentina", "Colombia" -> Continent.SOUTH_AMERICA;
            case "Australia" -> Continent.AUSTRALIA;
            case "Antarctica" -> Continent.ANTARCTICA;
            default -> null;
        };
    }
}
