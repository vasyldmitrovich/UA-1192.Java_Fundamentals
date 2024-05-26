package com.softserve.academy.edu07.hw.task_1;

public class SalariedEmployee extends Employee implements Payment{

    private double salary;
    private final int socialSecurityNumber;

    public SalariedEmployee(String name, double salary, int socialSecurityNumber) {
        super(name);
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    public int getId() {
        return socialSecurityNumber;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                ", socialSecurityNumber=" + socialSecurityNumber +
                '}';
    }

}
