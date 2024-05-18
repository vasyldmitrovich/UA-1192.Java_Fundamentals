package com.softserve.edu07.hw.entitiesHw1;

public class ContractEmployee extends Employee implements Payment{
    private int federalTaxIdmember;
    private int salary;
    private int hourse;

    public ContractEmployee(String name,String employeeld,int federalTaxIdmember,int salary,int hourse){
        super(employeeld,name);
        this.federalTaxIdmember=federalTaxIdmember;
        this.hourse=hourse;
        this.salary=salary;

    }
    @Override
    public double calculatePay() {
        return salary*hourse;
    }


}
