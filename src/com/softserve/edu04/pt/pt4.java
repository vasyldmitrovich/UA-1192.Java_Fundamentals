package com.softserve.edu04.pt;

import java.util.Scanner;

public class pt4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1(scanner);
        task2(scanner);
        task3(scanner);
        scanner.close();
    }

    public static void task1(Scanner scanner) {
        int countOdd = 0;

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber % 2 != 0) {
            countOdd++;
        }
        if (secondNumber % 2 != 0) {
            countOdd++;
        }
        if (thirdNumber % 2 != 0) {
            countOdd++;
        }

        System.out.printf("There are %d odd numbers.\n", countOdd);
    }

    public static void task2(Scanner scanner) {
        System.out.println("Enter the number of the day of the week (1-7):");
        int dayNumber = scanner.nextInt();

        String dayName = getDayName(dayNumber);
        System.out.println("Day of the week: " + dayName);
    }

    public static String getDayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day number";
        }
    }
    enum Continent {
        EUROPE, ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA
    }

    public static void task3(Scanner scanner) {
        System.out.print("Enter the name of a country: ");
        String country = scanner.next().trim().toLowerCase();

        Continent continent = getContinent(country);
        if (continent != null) {
            System.out.println("The country " + country + " is located in " + continent);
        } else {
            System.out.println("Continent not found for the entered country.");
        }
    }

    public static Continent getContinent(String country) {
        switch (country) {
            case "germany":
            case "france":
            case "italy":
            case "spain":
            case "ukraine":
                return Continent.EUROPE;
            case "china":
            case "india":
            case "japan":
                return Continent.ASIA;
            case "nigeria":
            case "egypt":
            case "south africa":
                return Continent.AFRICA;
            case "united states":
            case "canada":
            case "mexico":
                return Continent.NORTH_AMERICA;
            case "brazil":
            case "argentina":
            case "colombia":
                return Continent.SOUTH_AMERICA;
            case "australia":
            case "new zealand":
                return Continent.AUSTRALIA;
            default:
                return null;
        }
    }
}

