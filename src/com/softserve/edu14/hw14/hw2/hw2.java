package com.softserve.edu14.hw14.hw2;
import java.util.*;
import java.util.stream.Collectors;

public class hw2 {

    static class Employee {
        String name;

        public Employee(String name) {
            this.name = name;
        }
    }

    public static Optional<String> findMostPopularName(List<Employee> employees) {
        Map<String, Long> nameCounts = employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.name,
                        Collectors.counting()
                ));

        Optional<Map.Entry<String, Long>> mostPopularEntry = nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return mostPopularEntry.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopularName = findMostPopularName(employees);
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }
}
