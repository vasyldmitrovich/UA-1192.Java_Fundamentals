package com.softserve.edu04.pt;

import com.softserve.edu04.pt.entity.Product;
import com.softserve.edu04.pt.enums.Continent;
import com.softserve.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;


public class AppPractical {

    public static void main(String[] args) {// Nice to see code like that, all good
        //pt1
        checkOddNumbers();
        System.out.println("---------------------------------------");
        //pt2
        getDayOfTheWeek();
        System.out.println("---------------------------------------");
        //pt3
        getContinentByCountry();
        System.out.println("---------------------------------------");
        // pt4
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99, 10));
        products.add(new Product("Smartphone", 499.99, 15));
        products.add(new Product("Tablet", 299.99, 20));
        products.add(new Product("Headphones", 79.99, 30));

        System.out.println("Max price product: " + products.stream().max(Comparator.comparing(Product::getPrice)));
        System.out.println("Max quantity product: " + products.stream().max(Comparator.comparing(Product::getQuantity)));
        System.out.println("---------------------------------------");
    }


    private static void checkOddNumbers() {
        List<Double> scannerList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            scannerList.add(ScannerUtils.getValue("Input number", Double.class));
        }
        System.out.println("------------------------");
        AtomicInteger count = new AtomicInteger();
        scannerList.forEach(n -> {
            if (n % 2 != 0) {
                System.out.println(n);
                count.getAndIncrement();
            }
        });
        System.out.println("count of odd numbers = " + count);
    }

    private static void getDayOfTheWeek() {
        Integer dayNumber = ScannerUtils.getValue("Input day of the week", Integer.class);

        switch (dayNumber) {
            case 1:
                System.out.println("Monday | Понеділок");
                break;
            case 2:
                System.out.println("Tuesday | Вівторок");
                break;
            case 3:
                System.out.println("Wednesday | Середа");
                break;
            case 4:
                System.out.println("Thursday | Четвер");
                break;
            case 5:
                System.out.println("Friday | П'ятниця");
                break;
            case 6:
                System.out.println("Saturday | Субота");
                break;
            case 7:
                System.out.println("Sunday | Неділя");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                break;
        }
    }

    private static void getContinentByCountry() {
        String country = ScannerUtils.getValue("Enter country to find continent", String.class);
        switch (country.toLowerCase()) {
            case "china":
            case "india":
            case "japan":
                System.out.println(Continent.ASIA);
                break;
            case "france":
            case "germany":
            case "ukraine":
                System.out.println(Continent.EUROPE);
                break;
            case "nigeria":
            case "egypt":
            case "south africa":
                System.out.println(Continent.AFRICA);
                break;
            case "united states":
            case "canada":
            case "mexico":
                System.out.println(Continent.NORTH_AMERICA);
                break;
            case "brazil":
            case "argentina":
            case "colombia":
                System.out.println(Continent.SOUTH_AMERICA);
                break;
            case "australia":
                System.out.println(Continent.AUSTRALIA);
                break;
            case "antarctica":
                System.out.println(Continent.ANTARCTICA);
                break;
            default:
                System.out.println("Can't find continent");
                break;
        }
    }
}
