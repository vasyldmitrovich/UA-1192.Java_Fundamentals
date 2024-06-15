package com.softserve.edu14.hw;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void run(){
        Stream <Employee> employeeStream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String > mostPopularName = mostPopularName(employeeStream);
        System.out.print("The Most Popular Name is:");
        mostPopularName.ifPresent(System.out::println);

    }
    static Optional<String> mostPopularName(Stream <Employee> employees){
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
