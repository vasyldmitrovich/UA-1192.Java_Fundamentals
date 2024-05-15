package com.softserve.edu07.hw;

public class ContractEmployee extends Employee implements Payment {

    private double hourlyRate;

    private double hoursWorked;

    private String federalTaxIdMember;

    public ContractEmployee() {
        this.hourlyRate = 0;
        this.hoursWorked = 0;
    }

    public ContractEmployee(String employeeId ,double hourlyRate, double hoursWorked, String federalTaxIdMember) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return this.hourlyRate * this.hoursWorked;
    }
}
