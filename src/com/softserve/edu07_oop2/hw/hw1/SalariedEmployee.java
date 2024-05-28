package com.softserve.edu07_oop2.hw.hw1;

class SalariedEmployee extends Employee {
    String socialSecurityNumber;
    double monthlySalary;

    // Constructor
    SalariedEmployee(String employeeId, String socialSecurityNumber, double monthlySalary) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
    }

    // Override calculatePay() method for SalariedEmployee
    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}
