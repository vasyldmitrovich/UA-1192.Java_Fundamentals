package com.softserve.edu06.hw;

public class Emploee {
    protected String name;
    private int age;
    protected double salary;

    public Emploee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " + "Salary: \u20B4 %.2f.", name, age, salary);
    }

    public int getAge() {
       return age;
    }

    public String getName() {
        return name;
    }
}
