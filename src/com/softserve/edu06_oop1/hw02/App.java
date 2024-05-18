package com.softserve.edu06_oop1.hw02;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee("Anna", 20, 10_000);
        Developer dev = new Developer("Taras", 32, 20_000, "Java developer");
        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}
