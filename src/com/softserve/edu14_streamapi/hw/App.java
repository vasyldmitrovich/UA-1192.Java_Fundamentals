package com.softserve.edu14_streamapi.hw;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {// Good

//        task1();
        task2();

    }

    public static void task1(){

        List<Product> products = new ArrayList<>();

        products.add(new Product( "Phone", LocalDate.of(2021, 5, 10), 3500));
        products.add(new Product( "Phone", LocalDate.of(2022, 6, 15), 3000));
        products.add(new Product( "Phone", LocalDate.of(2020, 1, 20), 4500));
        products.add(new Product( "Laptop", LocalDate.of(2021, 3, 5), 5500));
        products.add(new Product( "Phone", LocalDate.of(2021, 2, 25), 3200));
        products.add(new Product( "Tablet", LocalDate.of(2021, 11, 30), 2500));
        products.add(new Product( "Phone", LocalDate.of(2019, 9, 10), 5000));
        products.add(new Product( "Phone", LocalDate.of(2018, 8, 18), 3700));
        products.add(new Product("Laptop", LocalDate.of(2020, 10, 22), 6000));
        products.add(new Product( "Phone", LocalDate.of(2021, 4, 9), 3900));
        products.add(new Product( "Tablet", LocalDate.of(2019, 7, 5), 2000));
        products.add(new Product( "Phone", LocalDate.of(2017, 6, 15), 2800));
        products.add(new Product( "Phone", LocalDate.of(2020, 3, 1), 3100));
        products.add(new Product( "Phone", LocalDate.of(2022, 2, 10), 2700));
        products.add(new Product( "Phone", LocalDate.of(2019, 12, 25), 3500));
        products.add(new Product( "Laptop", LocalDate.of(2018, 11, 20), 5200));
        products.add(new Product( "Phone", LocalDate.of(2020, 8, 12), 4100));
        products.add(new Product( "Phone", LocalDate.of(2021, 10, 2), 3000));
        products.add(new Product( "Tablet", LocalDate.of(2021, 12, 5), 2200));
        products.add(new Product( "Phone", LocalDate.of(2019, 5, 22), 4600));

        LocalDate oneYearAgo = LocalDate.now().minusYears(1);

        List<Product> sortedProducts = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        sortedProducts.forEach(System.out::println);
    }


    public static void task2(){

        Stream<Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopularName = mostPopularName(employees);
        mostPopularName.ifPresent(System.out::println);
    }


    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }

}
