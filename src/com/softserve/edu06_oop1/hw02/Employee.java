package com.softserve.edu06_oop1.hw02;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
        name = null;
        age = 0;
        salary = 0;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }


    public String report() {
        return String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
    }
}
