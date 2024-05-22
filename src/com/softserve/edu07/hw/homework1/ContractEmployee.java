package com.softserve.edu07.hw.homework1;

public class ContractEmployee extends Employee implements Payment{

    private String fedTaxIdmember;
    private String name;
    private int fixMonthPay;

    public ContractEmployee () {
        this.employeeId = "contr1";
        this.fedTaxIdmember = "12-3456789";
        this.name = "Nazar";
        this.fixMonthPay = 13000;
    }

    public ContractEmployee (String employeeId, String fedTaxIdmember, String name,
                             int fixMonthPay) {
        this.employeeId = employeeId;
        this.fedTaxIdmember = fedTaxIdmember;
        this.name = name;
        this.fixMonthPay = fixMonthPay;
    }

    public String getFedTaxIdmember() {
        return fedTaxIdmember;
    }

    public void setFedTaxIdmember(String fedTaxIdmember) {
        this.fedTaxIdmember = fedTaxIdmember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFixMonthPay() {
        return fixMonthPay;
    }

    public void setFixMonthPay(int fixMonthPay) {
        this.fixMonthPay = fixMonthPay;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "fedTaxIdmember='" + fedTaxIdmember + '\'' +
                ", name='" + name + '\'' +
                ", fixMonthPay=" + fixMonthPay +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }

    @Override
    public int calculatePay() {
        return this.fixMonthPay;
    }
}
