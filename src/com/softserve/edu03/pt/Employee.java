package com.softserve.edu03.pt;

public class Employee {
    private static final double BONUS = 0.1;
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0.0;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        setRate(rate);

    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public double getSalary() {
        return getRate() * getHours();
    }

    private double getBonuses() {
        return getSalary() * BONUS;
    }

    // This method after getters and setters
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses =" + "%.2f".formatted(getBonuses()) +
                '}';
    }


    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return (1 + BONUS) * totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public void setHours(double hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }
}
