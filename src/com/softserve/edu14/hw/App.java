package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    private static final Random RAND = new Random(System.currentTimeMillis());
    private static final String[] CATEGORIES = {"laptop", "phone", "TV", "printer"};
    private static final String[] NAMES = {"Peng", "Joel", "Ismail", "Haiyan", "Daniel", "Hong"};

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateProductsTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateEmployeeTask();
    }

    private static void demonstrateProductsTask() {
        List<Product> products = generateProducts(20);
        System.out.println("Products:");
        products.forEach(e -> System.out.println("\t" + e));
        System.out.println();

        System.out.println("Result list:");
//        List<Product> result =
        products.stream()
                .filter(e -> e.getCategory().equals("phone"))
                .filter(e -> e.getPrice() > 3000)
                .filter(e -> e.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .forEach(e -> System.out.println("\t" + e));
        System.out.println();
    }

    private static void demonstrateEmployeeTask() {
        List<Employee> employees = generateEmployees(10);

        System.out.println("Employees:");
        employees.forEach(e -> System.out.println("\t" + e));

        Optional<String> mostPopularName = mostPopularName(employees.stream());
        if (mostPopularName.isPresent()) {
            System.out.println("Most popular name: " + mostPopularName.get());
        } else {
            System.out.println("No most popular name");
        }
    }

    private static List<Product> generateProducts(int length) {
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            String category = CATEGORIES[RAND.nextInt(CATEGORIES.length)];
            //date is in bounds [current - 2 years and 4 month; current - 4 months]
            LocalDate date = LocalDate.now().minusMonths(4).minusMonths(RAND.nextInt(24));
            double price = RAND.nextInt(8000) + 2000 + roundDouble(RAND.nextDouble(), 2);
            products.add(new Product(category, date, price));
        }

        return products;
    }

    private static double roundDouble(double value, int digits) {
        return (double) Math.round(value * digits) / digits;
    }

    private static List<Employee> generateEmployees(int length) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            employees.add(new Employee(NAMES[RAND.nextInt(NAMES.length)]));
        }

        return employees;
    }

    private static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Integer> nameStatistic = employees
                .collect(Collectors.toMap(Employee::getName, e -> 1, Integer::sum));

        Optional<Map.Entry<String, Integer>> maybeMostPopularName = nameStatistic.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue));
        if (maybeMostPopularName.isPresent()) {
            int maybeMostPopularNameLength = maybeMostPopularName.get().getValue();
            int sameNameLengthCount =  (int) nameStatistic.entrySet().stream()
                    .filter(e -> e.getValue() == maybeMostPopularNameLength)
                    .count();

            if (sameNameLengthCount == 1) {
                return Optional.of(maybeMostPopularName.get().getKey());
            }
        }

        return Optional.empty();
    }
}
