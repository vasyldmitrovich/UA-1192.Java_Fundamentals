package com.softserve.edu07.hw;

public class SalariedEmployee extends Employee implements Payment {

    private double salary;

    private String socialSecurityNumber;

    public SalariedEmployee() {
        this.salary = 0;
    }

    public SalariedEmployee(String employeeId, double salary, String socialSecurityNumber) {
        super(employeeId);
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return this.salary;
    }
}
