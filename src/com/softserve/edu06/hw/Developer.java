package com.softserve.edu06.hw;

public class Developer extends Employee {

    private String position;

    public Developer(String name, int age, double salaryInUah, String position) {
        super(name, age, salaryInUah);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: ₴ %.2f.",
                name, age, position, salaryInUah);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "\n\t" + report() +
                "\n}";
    }
}
