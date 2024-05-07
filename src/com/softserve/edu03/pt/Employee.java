package com.softserve.edu03.pt;

public class Employee {// ok
    /**
     Object Person
     Fields:
     - name
     - hours
     - rate
     - totalSum

     Author: Andrew Tandyriak
     */
    private String name;
    private double hours;
    private double rate;
    static double totalSum = 0;

    public Employee() {
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public double getSalary() {
        return rate * hours;
    }

    public static double getBonusPercent() {
        return 0.1;
    }

    public double getBonus() {
        return getSalary() * getBonusPercent();
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public String toString() {
        return "Employee{Full name = '" + name + "', rate = " + rate + ", hours = " + hours + ", salary = " + getSalary() + ", bonus = " + getBonus() + " total = " + getSalary() + (getBonus() * getBonusPercent()) + "}";
    }
}