package com.softserve.edu14.hw;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
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