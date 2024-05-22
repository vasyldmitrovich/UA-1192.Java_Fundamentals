package com.softserve.edu07.hw.homework1;

public abstract class Employee {

    protected String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

}
