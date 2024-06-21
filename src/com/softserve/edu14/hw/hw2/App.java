package com.softserve.edu14.hw.hw2;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        Stream<Employee> employeeStream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopularName = mostPopularName(employeeStream);
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameFrequencyMap = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        if (nameFrequencyMap.isEmpty()) {
            return Optional.empty();
        } else {
            Map.Entry<String, Long> maxEntry = Collections.max(nameFrequencyMap.entrySet(), Map.Entry.comparingByValue());

            return Optional.of(maxEntry.getKey());
        }
    }
}
