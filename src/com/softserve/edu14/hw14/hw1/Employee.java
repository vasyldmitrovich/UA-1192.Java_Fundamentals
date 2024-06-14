package com.softserve.edu14.hw14.hw1;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // mostPopularName method
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
