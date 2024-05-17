package com.softserve.edu07.hw;

import java.util.Arrays;

abstract class Employee implements Payment, Comparable<Employee> {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }


    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }


}
