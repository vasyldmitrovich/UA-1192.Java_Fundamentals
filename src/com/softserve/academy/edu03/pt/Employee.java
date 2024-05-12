package com.softserve.academy.edu03.pt;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal rate;
    private BigDecimal hours;
    private static BigDecimal totalSum = new BigDecimal(0);

    public Employee() {
        this.name = "Unknown";
        this.rate = BigDecimal.ZERO;
        this.hours = BigDecimal.ZERO;
    }

    public Employee(String name, BigDecimal rate) {
        this.name = name;
        this.rate = rate;
        this.hours = BigDecimal.ZERO;
    }

    public Employee(String name, BigDecimal rate, BigDecimal hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum.add(getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }

    public static BigDecimal getTotalSum() {
        return totalSum;
    }

    public BigDecimal getSalary() {
        return rate.multiply(hours);
    }

    public BigDecimal getBonuses() {
        return getSalary().multiply(new BigDecimal("0.1"));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() +
                '}';
    }
}