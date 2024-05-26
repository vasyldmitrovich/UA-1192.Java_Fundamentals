package com.softserve.edu07.hw.hw1;

public class SalariedEmployee extends Employee implements Payment {
    String name;
    String socialSecurityNumber;
    double averageMonthlySalary;


    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, double averageMonthlySalary) {
        super(employeeId);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public double calculatePay() {
        return averageMonthlySalary;
    }

    @Override
    protected String getInfo() {
        String gap = "\n";
        return "-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap +
                "Name: " + getName() + gap +
                "Employee's ID: " + getEmployeeId() + gap +
                "Salary: " + calculatePay() + gap + "-".repeat(40);
    }

    @Override
    public String toString() {
        String gap = "\n";
        return "-".repeat(40) + gap +
                "Type" + getClass().getSimpleName() + gap + "Name: " + name + gap +
                "Social security number: " + socialSecurityNumber + gap +
                "Average month salary: " + averageMonthlySalary + gap +
                "-".repeat(40);
    }
}
