package com.softserve.edu07_oop2.hw01;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double fixedPaid) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public double getFixedPaid() {
        return fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
