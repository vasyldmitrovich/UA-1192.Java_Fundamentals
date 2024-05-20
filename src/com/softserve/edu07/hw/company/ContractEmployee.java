package com.softserve.edu07.hw.company;

public class ContractEmployee extends Employee implements Payment {
    private int workingHours;
    private static final double HOUR_RATE = 134.6;
    private int federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, int workingHours, int federalTaxIdmember) {
        super(employeeId, name);
        this.workingHours = workingHours;
        this.federalTaxIdMember = federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return HOUR_RATE * workingHours;
    }

    @Override
    public String toString() {
        return "Employee Id: " + getEmployeeId() + ", name: " + getName() + ", monthly wage: " + calculatePay();
    }
}
