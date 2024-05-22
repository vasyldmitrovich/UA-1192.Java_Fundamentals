package com.softserve.edu06.hw.company;

public class Developer extends Employee {

    private final String POSITION;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.POSITION = position;
    }

    @Override
    public String report() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Position: " + POSITION + ", Salary: " + getSalary();
    }
}
