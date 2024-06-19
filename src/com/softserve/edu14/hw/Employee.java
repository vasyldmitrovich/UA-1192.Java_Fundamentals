package com.softserve.edu14.hw;

public class Employee {

    private String name;

    public Employee () {
        this.name = "Igor";
    }

    public Employee (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}