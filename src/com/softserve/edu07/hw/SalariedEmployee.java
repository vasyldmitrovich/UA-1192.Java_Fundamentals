package com.softserve.edu07.hw;

public abstract class SalariedEmployee extends Employee implements Payment{// Implement this interphase in class Employee
    String socialSecurityNumber;// Make private and add getter and setter

    public SalariedEmployee(String... args){
        super(args[0], args[1]);
        this.socialSecurityNumber = args[2];
    }


}
