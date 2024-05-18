package com.softserve.edu06_oop1.hw02;

public class Developer extends Employee {
    private String average;

    public Developer() {
        super();
        average = null;
    }

    public Developer(String name, int age, int salary, String average) {
        super(name, age, salary);
        this.average = average;
    }

    @Override
    public String report() {
        return String.format("Name:%s, Age: %d," +
                " Position: %s, Salary: %.2f.", getName(), getAge(), average, getSalary());
    }
}
