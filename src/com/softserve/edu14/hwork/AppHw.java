package com.softserve.edu14.hwork;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppHw {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        List<Product> products = generateRandomProducts(20);

        products.forEach(System.out::println);

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000.0)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        filteredProducts.forEach(System.out::println);
    }

    public static List<Product> generateRandomProducts(int numberOfProducts) {
        List<Product> productList = new ArrayList<>();
        String[] categories = {"Phone", "Clothes", "Shoes", "Food", "Books", "Decoration"};
        Random rand = new Random();

        for (int i = 0; i < numberOfProducts; i++) {
            String category = categories[rand.nextInt(categories.length)];

            LocalDate date = LocalDate.now().minusDays(rand.nextInt(730));

            double price = 10 + (5000 - 10) * rand.nextDouble();

            Product product = new Product(category, date, price);
            productList.add(product);
        }
        return productList;
    }

    public static void task2() {
        Stream<Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopular = mostPopularName(employees);
        mostPopular.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCountMap = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}



