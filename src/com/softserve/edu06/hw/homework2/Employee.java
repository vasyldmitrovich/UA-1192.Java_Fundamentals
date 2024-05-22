package com.softserve.edu06.hw.homework2;

public class Employee {

    protected String name;// If you do not use this fields in child make this fields private and add getters and setters
    protected int age;
    protected double salary;

    public Employee (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String report () {
        return String.format("Name: %s, Age: %d, " +
                "Salary: \u20B4%.2f.", name, age, salary);
    }
}
