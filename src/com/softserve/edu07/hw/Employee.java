package com.softserve.edu07.hw;

public abstract class Employee {
    private String employeeId;

    public Employee() {
        this.employeeId = "";
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
