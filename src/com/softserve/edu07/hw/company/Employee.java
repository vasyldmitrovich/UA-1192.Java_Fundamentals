package com.softserve.edu07.hw.company;

import java.util.Comparator;

public abstract class Employee implements Payment {
    private String employeeId;
    private String name;

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

    public static class WageComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            return ((int)e2.calculatePay() - (int)e1.calculatePay());
        }
    }

}
