package com.softserve.edu03.pt;

public class Employee {

    private String name;

    private double rate;

    private int hours;

    private static double totalSum;

    public Employee() {
        this.name = "";
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name) {
        this.name = name;
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return Employee.totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }

    public double getBonuses() {
        return this.getSalary() * 0.1;
    }

    public double getTotalSalary() {
        return this.getSalary() + this.getBonuses();
    }

    @Override
    public String toString() {
        return "Employee [name = " + this.name + ", rate = " + this.rate + ", hours = " + this.hours + "]";
    }

}
