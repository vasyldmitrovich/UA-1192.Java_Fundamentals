package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.println("=".repeat(20) + "Task 1" + "=".repeat(20));
        task1();
        System.out.println("=".repeat(20) + "Task 2" + "=".repeat(20));
        task2();
    }

    public static void task1() {// Ok
        List<Product> products = createList(20);
        System.out.println("\nCreated list: ");
        for (Product product : products) {
            System.out.println(product);
        }
        List<Product> filteredProductList = products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isBefore(LocalDate.now().minusDays(365)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        System.out.println("\nSorted list: ");
        for (Product product : filteredProductList) {
            System.out.println(product);
        }

    }

    public static void task2() {
        List<Employee> employees = new ArrayList<>();
        String[] names = {"Charlie", "Bob", "Kylie", "Melony", "Bob", "Kylie", "Kylie", "Melony"};
        for (String name : names) {
            employees.add(new Employee(name));
        }
        System.out.println("Employees list: " + employees);
        Optional<String> theMostPopularName = theMostPopularName(employees.stream());
        theMostPopularName.ifPresent(name-> System.out.println("The most popular name: " + name));
    }

    public static List<Product> createList(int amountOfProducts) {
        List<Product> products = new ArrayList<>();
        String[] categories = {"Mouse", "Keyboard", "Laptop", "Phone", "Monitor", "Headphones", "Computer", "Microphone"};
        Double[] prices = {3000.5, 2000.25, 5000.46, 1500.50, 3800.25, 3250.50, 860.40, 1450.90};
        Random rnd = new Random();
        for (int i = 0; i < amountOfProducts; i++) {
            String category = categories[rnd.nextInt(categories.length)];
            Double price = prices[rnd.nextInt(prices.length)];
            LocalDate date = LocalDate.now().minusDays(rnd.nextInt((365 * 3)));
            Product product = new Product(category, date, price);
            products.add(product);
        }
        return products;
    }

    public static Optional<String> theMostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
