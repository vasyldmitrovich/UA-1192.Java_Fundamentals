package com.softserve.edu07.hw;

public class SalariedEmployee extends Employee implements Payment {

    private double hourlyRate;
    private int numOfHoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, String employeeId, double hourlyRate, int numOfHoursWorked, String socialSecurityNumber) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.numOfHoursWorked = numOfHoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getNumOfHoursWorked() {
        return numOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {

        return hourlyRate * numOfHoursWorked;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.calculatePay(), this.calculatePay());
    }


}
