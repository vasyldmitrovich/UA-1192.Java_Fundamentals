package com.softserve.academy.edu07.hw.task_1;

public class ContractEmployee extends Employee implements Payment{


    private int hoursWorked;
    private final int federalTaxIdMember;
    private double hourlyRate;


    public ContractEmployee(String name, int hoursWorked, double hourlyRate, int federalTaxIdMember) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.federalTaxIdMember = federalTaxIdMember;
    }


    /**
     * • The calculation formula for the hourly workers is as follow:
     *      the average monthly salary = hourly rate * number of hours worked
     *
     * @return the hoursWorked
     */
    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    public int getId() {
        return federalTaxIdMember;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", federalTaxIdMember=" + federalTaxIdMember +
                ", hourlyRate=" + hourlyRate +
                '}';
    }

}
