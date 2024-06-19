package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static String [] categories = {"Phone", "Computer", "Printer", "Laptop", "Router"};
    public static String [] names = {"Marya", "Andriy", "Taras", "Ira", "Nazar"};

    public static void main(String[] args) {
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second homework");
    }

    public static void homework1() {
        int count = 0;
        String category;
        LocalDate dateOfManufacture;
        double price;
        List<Product> productList = new ArrayList<>();

        while (count != 20) {
            category = categories[(int) (Math.random() * 5)];
            int year = (int) Math.round(Math.random() * (2023 - 2015) + 2015);
            int month = (int) Math.round(Math.random() * (12 - 1) + 1);
            int day = YearMonth.of(year, month).lengthOfMonth();
            dateOfManufacture = LocalDate.of(year, month, day);
            price = Math.random() * (6000 - 2000) + 2000;
            productList.add(new Product(category, dateOfManufacture, price));
            count++;
        }

        System.out.println("Initial product list:");
        for (Product item : productList) {
            System.out.println(item.toString());
        }

        System.out.println("Sorted by the price list of products belong to category Phone");
        productList.stream().filter(item -> item.getCategory().equals("Phone")).
                filter(item -> item.getPrice() > 3000).
                filter(item -> item.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1))).
                sorted(Comparator.comparingDouble(Product::getPrice)).
                forEach(item -> System.out.println(item.toString()));
    }

    public static void homework2() {
        List<Employee> employeeList = new ArrayList<>();
        int count = 0;
        while (count != 20) {
            String name = names[(int) (Math.random() * 5)];
            employeeList.add(new Employee(name));
            count++;
        }

        System.out.println("Initial employee list:");
        for (Employee item : employeeList) {
            System.out.println(item.toString());
        }

        Optional<String> mostPopularName = mostPopularName(employeeList.stream());
       if (mostPopularName.isPresent()) {
           System.out.println("Most popular name is: " + mostPopularName.get());
       } else {
           System.out.println("There is no most popular name in the list");
       }
    }

    public static Optional<String> mostPopularName(Stream<Employee> employeeStream) {
        Map <String, Integer> namesCount = employeeStream.collect(Collectors.toMap(Employee::getName, item -> 1, Integer::sum));


        if (!namesCount.isEmpty()){
            int mostPopularCount = Collections.max(namesCount.entrySet(), Map.Entry.comparingByValue()).getValue();

            int similarCount = (int) namesCount.entrySet().stream().
                    filter(item -> item.getValue() == mostPopularCount).count();

            if (similarCount == 1) {
                Optional<Map.Entry<String, Integer>> mostPopularName = namesCount.entrySet().stream().
                        filter(item -> item.getValue() == mostPopularCount).findFirst();
                return Optional.of(mostPopularName.get().getKey());
            }

        }

        return Optional.empty();
    }
}
