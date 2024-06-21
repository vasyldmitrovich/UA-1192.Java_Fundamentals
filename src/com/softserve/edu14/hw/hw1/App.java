package com.softserve.edu14.hw.hw1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<Product> products = createProductList();

        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted products:");
        filteredProducts.forEach(System.out::println);
    }

    public static List<Product> createProductList() {
        return Arrays.asList(
                new Product("Apple A", "Phone", LocalDate.of(2020, 6, 15), 4000),
                new Product("Apple B", "Laptop", LocalDate.of(2021, 2, 20), 2500),
                new Product("Apple C", "Phone", LocalDate.of(2019, 8, 10), 5000),
                new Product("Apple D", "Phone", LocalDate.of(2018, 11, 5), 3500),
                new Product("Apple E", "Tablet", LocalDate.of(2020, 4, 25), 2800),
                new Product("Samsung F", "Phone", LocalDate.of(2017, 9, 30), 6000),
                new Product("Samsung G", "Phone", LocalDate.of(2019, 10, 12), 3200),
                new Product("Samsung H", "Laptop", LocalDate.of(2022, 1, 1), 3800),
                new Product("Samsung I", "Phone", LocalDate.of(2018, 3, 8), 4500),
                new Product("Samsung J", "Phone", LocalDate.of(2020, 12, 5), 4200),
                new Product("HTC K", "Laptop", LocalDate.of(2019, 5, 18), 3300),
                new Product("HTC L", "Phone", LocalDate.of(2016, 7, 22), 4700),
                new Product("HTC M", "Phone", LocalDate.of(2021, 4, 11), 3800),
                new Product("HTC N", "Tablet", LocalDate.of(2019, 11, 9), 2900),
                new Product("HTC O", "Phone", LocalDate.of(2017, 12, 30), 5100),
                new Product("LG P", "Phone", LocalDate.of(2020, 2, 14), 4400),
                new Product("LG Q", "Laptop", LocalDate.of(2018, 9, 7), 3600),
                new Product("LG R", "Phone", LocalDate.of(2019, 6, 3), 4900),
                new Product("LG S", "Phone", LocalDate.of(2017, 3, 28), 4300),
                new Product("LG T", "Phone", LocalDate.of(2021, 8, 19), 4700)
        );
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return null;
    }

    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

