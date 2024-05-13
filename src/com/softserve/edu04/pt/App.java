package com.softserve.edu04.pt;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        determineOddNumbers();

        dayOfWeek();
        countryOfContinent();
        createProduct();
    }

    public static void determineOddNumbers() {
        int count = 0;
        System.out.println("Enter three numbers :");

        int a = scanner.nextInt();
        if (a % 2 != 0) {
            count++;
        }
        a = scanner.nextInt();
        if (a % 2 != 0) {
            count++;
        }
        a = scanner.nextInt();
        if (a % 2 != 0) {
            count++;
        }
        System.out.println("Count of odd numbers is : " + count);
    }

    public static void dayOfWeek() {
        System.out.println("Enter the number of the day of week (from 1 to 7) : ");
        int number = scanner.nextInt();
        if (number < 1 || number > 7) {
            System.out.println("Error please enter number from 1 to 7");
        } else {
            DayOfWeek day = DayOfWeek.of(number);
            String fr = day.getDisplayName(TextStyle.FULL, Locale.FRANCE);
            System.out.println("Day is " + day + "\nJour de la semaine " + fr.toUpperCase());
        }
    }

    public static void countryOfContinent() {
        Continent continent;
        System.out.println("Enter the country : ");
        scanner.nextLine();
        String country = (scanner.nextLine()).toLowerCase();
        continent = switch (country) {
            case "ukraine", "spain", "italy", "france" -> Continent.EUROPE;
            case "usa", "canada", "mexico" -> Continent.NORTH_AMERICA;
            case "brasilia", "argentina", "chili" -> Continent.SOUTH_AMERICA;
            case "china", "kazakhstan", "japan" -> Continent.ASIA;
            case "australia" -> Continent.AUSTRALIA;
            case "eqypt", "madagaskar", "zimbabve" -> Continent.AFRICA;
            default -> null;
        };
        System.out.println(continent);
    }

    public static void createProduct() {
        Product product1 = new Product("Schneider", 24111.2, 12);
        Product product2 = new Product("ABB", 589774.5, 2);
        Product product3 = new Product("BHS", 45.8, 12);
        Product product4 = new Product("Elau", 452.98, 12);

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
        System.out.println("The most expensive product is : "
                + "name: " + mostExpensive.getName() + ", quantity : " + mostExpensive.getQuantity());

        int biggestQuantity = product1.getQuantity();

        if (product2.getQuantity() > biggestQuantity) {
            biggestQuantity = product2.getQuantity();
        }
        if (product3.getQuantity() > biggestQuantity) {
            biggestQuantity = product3.getQuantity();
        }
        if (product4.getQuantity() > biggestQuantity) {
            biggestQuantity = product4.getQuantity();
        }

        System.out.println("The following products have the largest quantity " + biggestQuantity + " :");
        if (biggestQuantity == product1.getQuantity()) {
            System.out.println(product1.getName());
        }
        if (biggestQuantity == product2.getQuantity()) {
            System.out.println(product2.getName());
        }
        if (biggestQuantity == product3.getQuantity()) {
            System.out.println(product3.getName());
        }
        if (biggestQuantity == product4.getQuantity()) {
            System.out.println(product4.getName());
        }
    }

}
