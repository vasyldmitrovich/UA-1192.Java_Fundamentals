package com.softserve.edu06.hw.company;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected double getSalary() {
        return salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d," +
                "Salary: \u20b4 %.2f.", name, age, salary);
    }
}
