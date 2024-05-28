package com.softserve.edu07_oop2.hw.hw1;

class ContractEmployee extends Employee {
    String federalTaxId;
    double hourlyRate;
    int hoursWorked;

    // Constructor
    ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override calculatePay() method for ContractEmployee
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
