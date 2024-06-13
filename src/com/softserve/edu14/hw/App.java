package com.softserve.edu14.hw;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {// This is good
        System.out.println("Task 1");
        task1();

        System.out.println("Task 2");
        task2();
    }

    public static void task1() {
        List<Product> productList = new ArrayList<>();

        String[] categories = {"Electronics", "Phone", "Toys", "Food", "Books"};

        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String category = categories[rand.nextInt(categories.length)];

            Date date = new Date(System.currentTimeMillis() - rand.nextLong(2 * 365 * 24 * 60 * 60 * 1000L)); // Up to 2 years ago

            double price = 10 + (5000 - 10) * rand.nextDouble();

            Product product = new Product(category, date, price);
            productList.add(product);
        }

        for (Product product : productList) {
            System.out.println(product);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1);
        Date oneYearAgo = calendar.getTime();

        List<Product> filteredProductList = productList.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().before(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        System.out.println("Sorted products");
        for (Product product : filteredProductList) {
            System.out.println(product);
        }
    }

    public static void task2() {
        List<Employee> employees = Arrays.asList(
                new Employee("John"),
                new Employee("Alice"),
                new Employee("John"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("Alice"),
                new Employee("John"),
                new Employee("John")
        );

        Optional<String> mostPopularName = mostPopularName(employees.stream());

        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
