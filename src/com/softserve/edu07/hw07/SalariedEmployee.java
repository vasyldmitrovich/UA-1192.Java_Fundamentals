package com.softserve.edu07.hw07;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
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
