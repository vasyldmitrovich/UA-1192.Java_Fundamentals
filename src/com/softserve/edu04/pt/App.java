package com.softserve.edu04.pt;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

//        performTask41();
//        performTask42();
//        performTask43();
        performTask44();

    }

    private static void performTask41() {
/*
    Enter three numbers from the console. Determine and output the result of how many of them are odd. Output the
    result to the console.
 */
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter whole integer number: ");
            int remainder = scanner.nextInt() % 2;
            if (remainder != 0) {
                counter++;
            }
        }
        System.out.println("Total odds number is: " + counter);
    }

    private static void performTask42() {
/*
    Enter the number of the day of the week from the console. Output the name of the day of the week in two languages.
    Output the result to the console.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of the day of the week: ");
        int day = 0;
        while (day < 1 || day > 7) {
            day = scanner.nextInt();
            if (day < 1 || day > 7) {
                System.out.println("Please enter whole number from 1 to 7");
            }
        }
        DayOfWeek dayName = DayOfWeek.of(day);
        System.out.println("This days name is \"" + dayName.getDisplayName(TextStyle.FULL_STANDALONE, Locale.US) + "\" in English");
        System.out.println("This days name is \"" + dayName.getDisplayName(TextStyle.FULL_STANDALONE, Locale.FRANCE) + "\" in French");
    }

    private static void performTask43() {
/*
Declare an enum with the names of continents (e.g., Europe, Asia, Africa, etc.). Ask the user to enter the name of the
country from the console. Using a switch statement, determine the continent to which the entered country belongs and
output the name of the continent. Output the result to the console.
 */

        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine().toLowerCase();

        switch (country) {

            case "algeria":
            case "egypt":
            case "ethiopia":
                System.out.println(Continent.AFRICA);
                break;
            case "great britain":
            case "germany":
            case "ukraine":
            case "poland":
                System.out.println(Continent.EUROPE);
                break;
            case "japan":
            case "india":
            case "korea":
                System.out.println(Continent.ASIA);
                break;
            case "canada":
            case "united states":
            case "mexico":
                System.out.println(Continent.NORTH_AMERICA);
                break;
            case "argentina":
            case "brazil":
            case "peru":
                System.out.println(Continent.SOUTH_AMERICA);
                break;
            case "australia":
                System.out.println(Continent.AUSTRALIA);
                break;
            case "antarctica":
                System.out.println(Continent.ANTARCTICA);
                break;
            default:
                System.out.println("Sorry, this program can't recognize this country yet");

        }
    }

    private static void performTask44(){
/*
    Output the name and quantity of the most expensive item;
    Output the name of the items, which has the biggest quantity.
 */
        Product[] products = new Product[4];
        products[0] = new Product("T-shirt", 10.0, 97);
        products[1] = new Product("Socks", 2.0, 100);
        products[2] = new Product("Pants", 18.0, 60);
        products[3] = new Product("Coat", 150.0, 8);

        Arrays.sort(products, Comparator.comparing(Product::getPrice));
        System.out.println("Most expensive product is: " + products[3].getName() + ", " + products[3].getQuantity() + " pcs.");
        Arrays.sort(products, Comparator.comparing(Product::getQuantity));
        System.out.println("Product with biggest quantity is: " + products[3].getName());

    }

}

