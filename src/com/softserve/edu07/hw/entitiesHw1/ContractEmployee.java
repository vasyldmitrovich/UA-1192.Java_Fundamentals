package com.softserve.edu07.hw.entitiesHw1;

public class ContractEmployee extends Employee {// Make implements Payment in class Employee
    private int federalTaxIdmember;
    private int salary;
    private int hourse;

    public ContractEmployee(String name, String employeeld, int federalTaxIdmember, int salary, int hourse) {
        super(employeeld, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourse = hourse;
        this.salary = salary;

    }


    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHourse() {
        return hourse;
    }

    public void setHourse(int hourse) {
        this.hourse = hourse;
    }

    @Override
    public double calculatePay() {
        return salary * hourse;
    }


}
