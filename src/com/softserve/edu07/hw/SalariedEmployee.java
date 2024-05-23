package com.softserve.edu07.hw;

public abstract class SalariedEmployee extends Employee implements Payment{
    String socialSecurityNumber;

    public SalariedEmployee(String... args){
        super(args[0], args[1]);
        this.socialSecurityNumber = args[2];
    }


}
