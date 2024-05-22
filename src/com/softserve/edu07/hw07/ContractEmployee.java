package com.softserve.edu07.hw07;

public class ContractEmployee extends Employee implements Payment {// Make implementation in class Employee not here
    String federalTaxId;// Make fields private and add getters and setters
    double hourlyRate;
    int hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
