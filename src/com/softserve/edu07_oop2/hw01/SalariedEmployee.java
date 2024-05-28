package com.softserve.edu07_oop2.hw01;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double hourlyRate;
    private int hoursWorked;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
