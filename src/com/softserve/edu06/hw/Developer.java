package com.softserve.edu06.hw;

public class Developer extends Employee{
    private String positionInCompany;

    public Developer(String name, int age, double salary, String positionInCompany) {
        super(name, age, salary);
        this.positionInCompany = positionInCompany;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: ₴ %.2f.", getName(), getAge(), positionInCompany, getSalary());
    }
}
