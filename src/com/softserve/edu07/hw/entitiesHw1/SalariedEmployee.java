package com.softserve.edu07.hw.entitiesHw1;

public class SalariedEmployee extends Employee implements  Payment{
    private int socialSecurityNumber;
    private double salary;
    public SalariedEmployee(String name,String employeeId,int socialSecurityNumber,double salary){
        super(employeeId,name);
        this.socialSecurityNumber=socialSecurityNumber;
        this.salary=salary;
    }
    @Override
    public double calculatePay() {

        return salary;
    }


}
