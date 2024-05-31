package com.softserve.edu07.hw07;

public class SalariedEmployee extends Employee implements Payment {// Make implementation in class Employee not here
    String socialSecurityNumber;// Make fields private and add getters and setters
    double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
