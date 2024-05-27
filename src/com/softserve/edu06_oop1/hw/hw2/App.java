package com.softserve.edu06_oop1.hw.hw2;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice", 28, 55000.00);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
