package com.softserve.edu03.pt;

public class Employee {

    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public Employee(){}

    public Employee(String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(Object... args){// If in this args will be not String first argument and not double second etc... Will be exception?
        this.name = (String) args[0];
        this.rate = (double) args[1];
        this.hours = (int)args[2];
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
        Employee.totalSum += totalSum;
    }

    public double getSalary(){
        return rate*hours;
    }

    public double getBonuses(){
        return getSalary()*0.1;
    }

    @Override
    public String toString() {
        return "Employee: " + name +
                ", Salary: " +
                getSalary() + " Bonuses: " + getBonuses();
    }
}
