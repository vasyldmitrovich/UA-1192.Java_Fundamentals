package com.softserve.edu07.hw;

public abstract class SalariedEmployee extends Employee{// Implement this interphase in class Employee
    private String socialSecurityNumber;// Make private and add getter and setter

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee(String... args){
        super(args[0], args[1]);
        this.socialSecurityNumber = args[2];
    }


}
