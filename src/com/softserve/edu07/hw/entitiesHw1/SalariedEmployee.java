package com.softserve.edu07.hw.entitiesHw1;

public class SalariedEmployee extends Employee implements  Payment{// Make implements Payment in class Employee
    private int socialSecurityNumber;
    private double salary;

    public SalariedEmployee(String name,String employeeId,int socialSecurityNumber,double salary){
        super(employeeId,name);
        this.socialSecurityNumber=socialSecurityNumber;
        this.salary=salary;
    }

    // Add getters and setters

    @Override
    public double calculatePay() {

        return salary;
    }


}
