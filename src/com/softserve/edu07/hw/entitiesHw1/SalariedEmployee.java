package com.softserve.edu07.hw.entitiesHw1;

public class SalariedEmployee extends Employee {
    private int socialSecurityNumber;
    private double salary;

    public SalariedEmployee(String name, String employeeId, int socialSecurityNumber, double salary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Add getters and setters

    @Override
    public double calculatePay() {

        return salary;
    }


}
