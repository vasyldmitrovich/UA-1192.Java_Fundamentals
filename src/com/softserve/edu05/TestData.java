package com.softserve.edu05;

public class TestData {
    public static Employee[] getEmployees() {
        return new Employee[]{
                new Employee("John", 1, 50000),
                new Employee("Alice", 2, 60000),
                new Employee("Bob", 1, 55000),
                new Employee("Emily", 3, 48000),
                new Employee("David", 2, 62000)
        };
    }
}
