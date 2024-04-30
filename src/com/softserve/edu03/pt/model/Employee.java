package com.softserve.edu03.pt.model;


public class Employee {
    private static double totalSum;
    private static double totalSumWithBonus;

    private String name;
    private int rate;
    private int hours;

    public Employee() {
    };

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        updateTotalSum(getSalary());
        updateTotalSumWithBonuses(getSalary(), getBonuses());
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    private static void updateTotalSum(int salary) {
        totalSum += salary;
    }

    private static void updateTotalSumWithBonuses(double salary, double bonus) {
        totalSumWithBonus += (bonus + salary);
    }

    public static double getTotalSumWithBonus() {
        return totalSumWithBonus;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
