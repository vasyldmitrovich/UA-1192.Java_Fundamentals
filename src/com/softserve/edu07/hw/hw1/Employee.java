package com.softserve.edu07.hw.hw1;

public abstract class Employee implements Payment {
    protected String employeeId;
    protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract double calculatePay();
}
