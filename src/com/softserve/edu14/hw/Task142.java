package com.softserve.edu14.hw;

import java.util.*;
import java.util.stream.Stream;

public class Task142 {// task is nice

    public static void execute() {
        String[] names = {"Bob", "Din", "Sam", "Sam"};
        List<Employee> employees = Arrays.stream(names).map(Employee::new).toList();

        Optional<String> name = mostPopularName(employees.stream());
        if (name.isPresent()) {
            System.out.println("Most popular name is: " + name.get());
        } else {
            System.out.println("There is no most popular name");
        }
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {

        Map<String, Integer> names = new TreeMap<>();
        employees.forEach(employee -> {
            names.computeIfPresent(employee.getName(), (key, val) -> val += 1);
            names.putIfAbsent(employee.getName(), 1);
        });

        return names.entrySet().stream().
                filter(entry -> entry.getValue() > 1).
                max(Map.Entry.comparingByValue()).
                map(Map.Entry::getKey);
    }

}

