package com.softserve.edu03.pt;

public class Employee {// Good

    private static double totalSum;

    private String name;
    private double rate;
    private int hours;

    public Employee() {}

    public Employee(String prompt) throws NumberFormatException {
        String[] parts = prompt.split(" ");
        this.name = parts[0];
        this.rate = Double.parseDouble(parts[1]);
        this.hours = Integer.parseInt(parts[2]);
        Employee.totalSum += getSalary();
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        Employee.totalSum += getSalary();
    }

    public static double getTotalSum() {
        return Employee.totalSum;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        Employee.totalSum -= getSalary();
        this.rate = rate;
        Employee.totalSum += getSalary();
    }

    public void setHours(int hours) {
        Employee.totalSum -= getSalary();
        this.hours = hours;
        Employee.totalSum += getSalary();
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                '}';
    }
}
