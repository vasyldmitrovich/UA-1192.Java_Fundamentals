package com.softserve.edu03.pt;

public class Employee {

    private static double totalSum;

    private String name;

    private double rate;

    private int hours;

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
        totalSum += this.getTotalSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
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
        return "Employee [name = " + this.name + ", rate = " + this.rate + ", hours = " +
                this.hours + ", total salary = " + this.getTotalSalary() + "]";
    }

}
