package com.softserve.edu07.hw.hw1;

public class ContractEmployee extends Employee implements Payment {
    String name;
    String federalTaxIdmember;
    double hourlyRate;
    double hoursQuantity;
    double averageMonthlySalary = calculatePay();

    public ContractEmployee(String name, String employeeId, String federalTaxIdmember, double hourlyRate, double hoursQuantity) {
        super(employeeId);
        this.name = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hoursQuantity = hoursQuantity;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursQuantity() {
        return hoursQuantity;
    }


    @Override
    public double calculatePay() {
        return getHourlyRate() * getHoursQuantity();
    }

    @Override
    protected String getInfo() {
        String gap = "\n";
        return "-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap +
                "Name: " + getName() + gap +
                "Employee's ID: " + getEmployeeId() + gap +
                "Salary: " + calculatePay() + gap + "-".repeat(40);
    }

    @Override
    public String toString() {
        String gap = "\n";
        return "-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap +
                "Name: " + name + gap +
                "Federal tax id member: " + federalTaxIdmember + gap +
                "Hourly rate: " + hourlyRate + gap +
                "Hours quantity: " + hoursQuantity + gap +
                "Average salary: " + calculatePay() + gap + "-".repeat(40);
    }
}