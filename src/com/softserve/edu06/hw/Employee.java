package com.softserve.edu06.hw;

public class Employee {

    private String name;
    private int age;
    private double salaryInUah;

    public Employee(String name, int age, double salaryInUah) {
        this.name = name;
        this.age = age;
        this.salaryInUah = salaryInUah;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalaryInUah() {
        return salaryInUah;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: ₴ %.2f.", name, age, salaryInUah);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n\t" + report() +
                "\n}";
    }
}
