package com.softserve.edu06.hw.hw2;

public class Employee {
    protected String name;// I recommended make private and add getters and setters
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " + "Salary: \u20B4 %.2f.", name, age, salary);
    }
}
