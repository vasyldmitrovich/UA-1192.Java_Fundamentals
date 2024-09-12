package com.softserve.edu04;

import java.util.Scanner;

public class pt {// Rename class to Pt.java


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
        public static void task1() {
            // make refactor of code, because for now it is not correct
    int oddCount = 0;

        System.out.println("Enter three numbers:");

        for (int i = 0; i < 3; i++) {
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            oddCount++;
        }
    }
        System.out.println("Number of odd numbers: " + oddCount);
}

    public static void task2() {

 System.out.print("Enter the number of the day (1-7): ");
    int day = scanner.nextInt();

    String englishDay = "";
    String ukrainDay = "";

        switch (day) {
        case 1:
            englishDay = "Monday";
            ukrainDay = "Понеділок";
            break;
        case 2:
            englishDay = "Tuesday";
            ukrainDay = "Вівторок";
            break;
        case 3:
            englishDay = "Wednesday";
            ukrainDay = "Середа";
            break;
        case 4:
            englishDay = "Thursday";
            ukrainDay = "Четвер";
            break;
        case 5:
            englishDay = "Friday";
            ukrainDay = "П'ятница";
            break;
        case 6:
            englishDay = "Saturday";
            ukrainDay = "Суббота";
            break;
        case 7:
            englishDay = "Sunday";
            ukrainDay = "Неділя";
            break;
        default:
            englishDay = "Invalid day number";
            ukrainDay = "Невірний номер";

    }

        System.out.println("Day in English: " + englishDay);
        System.out.println("День українською мовою: " + ukrainDay);

}
    enum Continent {// Move to Continent.java
        AFRICA,
        ANTARCTICA,
        ASIA,
        EUROPE,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AUSTRALIA
    }


    public static void task3() {
 System.out.print("Enter the name of the country: ");
    String country = scanner.nextLine();

    Continent continent = identifyContinent(country);

        if (continent != null) {
        System.out.println("The country " + country + " belongs to the continent " + continent);
    } else {
        System.out.println("Continent not found for the country " + country);
    }
}

public static Continent identifyContinent(String country) {
    switch (country.toLowerCase()) {
        case "morocco":
        case "egypt":

            return Continent.AFRICA;
        case "china":
        case "india":

            return Continent.ASIA;
        case "germany":
        case "france":

            return Continent.EUROPE;

        case "australia":

            return Continent.AUSTRALIA;
        case "polar bear":
        case "penguin":

            return Continent.ANTARCTICA;
        case "usa":
        case "mexiсo":

            return Continent.NORTH_AMERICA;
        case "brazil":
        case "peru":

            return Continent.SOUTH_AMERICA;
        default:
            return null;
    }
}

    static class Product {// This class should be in file Product.java
        public String name;
        public double price;
        public int quantity;

        // Where constructor without parameters
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Where getters and setters equals and hashCode?
    }

    public static void task4() {
            // Create four instances of the Product class
            Product product1 = new Product("Laptop", 1000.00, 5);
            Product product2 = new Product("Phone", 500.00, 10);
            Product product3 = new Product("Tablet", 750.00, 7);
            Product product4 = new Product("Watch", 250.00, 15);

            // Find the most expensive item
            Product mostExpensive = max(product1, product2, product3, product4, (p1, p2) -> (int) (p1.price - p2.price));

            // Find the item with the biggest quantity
            Product biggestQuantity = max(product1, product2, product3, product4, (p1, p2) -> p1.quantity - p2.quantity);

            // Print the name and quantity of the most expensive item
            System.out.println("Most Expensive Item: " + mostExpensive.name + " (Quantity: " + mostExpensive.quantity + ")");

            // Print the name of the item with the biggest quantity
            System.out.println("Biggest Quantity: " + biggestQuantity.name + " (Quantity: " + biggestQuantity.quantity + ")");
        }

        public static <T> T max(T p1, T p2, T p3, T p4, java.util.Comparator<T> comparator) {
            T max = p1;
            if (comparator.compare(max, p2) < 0) {
                max = p2;
            }
            if (comparator.compare(max, p3) < 0) {
                max = p3;
            }
            if (comparator.compare(max, p4) < 0) {
                max = p4;
            }
            return max;
        }
}


