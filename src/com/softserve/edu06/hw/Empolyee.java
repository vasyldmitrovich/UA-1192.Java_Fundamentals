package com.softserve.edu06.hw;

import static java.lang.String.format;

public class Empolyee {// make abstruct

    private String name;
    private int age;
    private double salary;

    public Empolyee() {
    }

    public Empolyee(String name, int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: \u20B4 %.2f", name, age, salary);
    }


}

