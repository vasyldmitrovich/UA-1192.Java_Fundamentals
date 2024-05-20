package com.softserve.edu07.hw.company;

public class SalariedEmployee extends Employee implements Payment {
    private double monthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double monthlyPayment, String socialSecurityNumber) {
        super(employeeId, name);
        this.monthlyPayment = monthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    @Override
    public double calculatePay() {
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return "Employee Id: " + getEmployeeId() + ", name: " + getName() + ", monthly wage: " + calculatePay();
    }
}
