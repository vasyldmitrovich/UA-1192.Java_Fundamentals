package com.softserve.edu07.hw.hw1;

public abstract class Employee implements Payment, Comparable<Employee> {// Good
    protected String employeeId;// but make private

    protected Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    protected String getInfo() {
        return null;
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public int compareTo(Employee employee) {
        if (employee instanceof Employee){
            return (int) (-this.calculatePay() + employee.calculatePay());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId='" + employeeId + '\'' + '}';
    }
}
