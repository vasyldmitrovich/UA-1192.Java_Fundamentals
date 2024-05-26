package com.softserve.edu07.hw.hw1;

public abstract class Employee implements Payment {
    protected String employeeId;

    protected Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    protected String getInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId='" + employeeId + '\'' + '}';
    }
}
