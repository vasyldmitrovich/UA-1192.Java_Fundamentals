package com.softserve.edu07.hw1;

public class ContractEmployee extends Employee {

    private final String federalTaxIdmember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, int federalTaxIdmember, double hourlyRate) {
        super(employeeId);
        this.federalTaxIdmember = Integer.toString(federalTaxIdmember); // Перетворюємо int в String
        this.hourlyRate = hourlyRate;

    }


    @Override
    public double calculatePay() {
        return 0;
    }
}
