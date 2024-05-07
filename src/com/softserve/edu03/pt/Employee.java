package com.softserve.edu03.pt;

class Employee {
    public static double totalSum = 0.0;
    private String name;
    private int hours;
    private double rate;
    private static final double BONUS_RATE = 0.1;


    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public double getSalary() {
        return getRate() * getHours();
    }

    public double getBonuses() {
        return BONUS_RATE * getSalary();
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
        return (1 + BONUS_RATE) * totalSum;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public void setName(String name) {
        this.name = name;
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
