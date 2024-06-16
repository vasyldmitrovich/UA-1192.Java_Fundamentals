package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWorkTask {

    String[] category = {"DishWasher", "Phone", "Laptop", "TV"};


    public void task1() {
        List<Product> products = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();

        //create products
        for (int i = 0; i < 20; i++) {
            products.add(i, new Product(getRandomCategory(category), randomDate(), randomPrice()));
        }
        System.out.printf("List of products" + products);

        List<Product> productsFiltered = products.stream()
                .filter(product -> product.getManufactureCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> (currentYear - product.getDateOfManufacture().getYear()) > 1)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
        System.out.println("\nFiltered products: " + productsFiltered);
    }

    public void task2() {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam"));

        Optional<String> mostPopularName = mostPopularName(employeeList.stream());
        mostPopularName.ifPresent(System.out::println);
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    private static String getRandomCategory(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    private static LocalDate randomDate() {
        long minDay = LocalDate.of(2019, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2024, 6, 15).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    private static double randomPrice() {
        return new Random().nextDouble(1000, 10000);
    }
}
