package com.softserve.edu07.hwork;

public class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdmember;
    private double fixedPaid;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double fixedPaid) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedPaid = fixedPaid;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public double getFixedPaid() {
        return fixedPaid;
    }

    @Override
    public double calculatePay() {
        return fixedPaid;
    }
}
