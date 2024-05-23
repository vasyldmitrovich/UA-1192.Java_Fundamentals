package com.softserve.edu07.hw;

public abstract class ContractEmployee extends Employee implements Payment{
    String federalTaxIdMember;

    public ContractEmployee(String... args){
        super(args[0], args[1]);
        this.federalTaxIdMember = args[2];
    }

}
