package com.softserve.edu03.pt.PracticalTask2;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    Employee(){}

    Employee(String name) {
        this.name = name;
    }
    Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum -= getSalary();
        this.hours = hours;
        totalSum += getSalary();
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public int getSalary() {
        return rate * hours;
    }

    public String getBonuses() {
        return "Bonuses to salary is " + getSalary()/10;
    }
}
