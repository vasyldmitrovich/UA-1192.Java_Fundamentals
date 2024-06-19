package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Manufacturer1", "Phone", LocalDate.now().minusYears(2), 3500),
                new Product("Manufacturer2", "Phone", LocalDate.now().minusMonths(6), 2000),
                new Product("Manufacturer3", "Laptop", LocalDate.now().minusYears(1).minusDays(1), 4000),
                new Product("Manufacturer4", "Phone", LocalDate.now().minusYears(1).minusDays(2), 4500),
                new Product("Manufacturer5", "Tablet", LocalDate.now().minusYears(3), 1500),
                new Product("Manufacturer6", "Phone", LocalDate.now().minusYears(2), 3200),
                new Product("Manufacturer7", "Phone", LocalDate.now().minusMonths(10), 2800),
                new Product("Manufacturer8", "Laptop", LocalDate.now().minusYears(1), 3300),
                new Product("Manufacturer9", "Phone", LocalDate.now().minusYears(1).minusDays(3), 3100),
                new Product("Manufacturer10", "Tablet", LocalDate.now().minusYears(2), 2400),
                new Product("Manufacturer11", "Phone", LocalDate.now().minusYears(4), 3800),
                new Product("Manufacturer12", "Laptop", LocalDate.now().minusMonths(11), 3600),
                new Product("Manufacturer13", "Phone", LocalDate.now().minusYears(3), 4100),
                new Product("Manufacturer14", "Tablet", LocalDate.now().minusYears(1), 2900),
                new Product("Manufacturer15", "Phone", LocalDate.now().minusYears(1).minusDays(4), 3300),
                new Product("Manufacturer16", "Laptop", LocalDate.now().minusYears(1), 3700),
                new Product("Manufacturer17", "Phone", LocalDate.now().minusYears(2), 3400),
                new Product("Manufacturer18", "Tablet", LocalDate.now().minusYears(5), 2700),
                new Product("Manufacturer19", "Phone", LocalDate.now().minusYears(1).minusDays(5), 3900),
                new Product("Manufacturer20", "Laptop", LocalDate.now().minusYears(1), 4300)
        );
        List<Product> filteredAndSortedProducts = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toList());

        filteredAndSortedProducts.forEach(System.out::println);

        List<Employee> employees = Arrays.asList(
                new Employee("John"),
                new Employee("Mary"),
                new Employee("John"),
                new Employee("Steve"),
                new Employee("Mary"),
                new Employee("John")
        );

        Optional<String> mostPopularName = mostPopularName(employees.stream());
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
