package com.softserve.edu06.hw;

public class Employee {

    protected String name;// You can use private and add getters and setters, but it is god now
    protected int age;
    protected double salaryInUah;

    public Employee(String name, int age, double salaryInUah) {
        this.name = name;
        this.age = age;
        this.salaryInUah = salaryInUah;
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
