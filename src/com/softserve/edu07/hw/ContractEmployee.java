package com.softserve.edu07.hw;

public class ContractEmployee extends Employee implements Payment {

    private double fixedMonthlyPayment;
    private String federalTaxIdMember;

    public ContractEmployee(String name, String employeeId, double fixedMonthlyPayment, String federalTaxIdMember) {
        super(name, employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public int compareTo(Employee o) {
        return Double.compare(o.calculatePay(), this.calculatePay());
    }
}
