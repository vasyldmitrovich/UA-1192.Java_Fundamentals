package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    static int totalSum;

    public Employee() {

    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;


    }


    public Employee(String name) {

    }

// Created getSalary method to get a salary of employee;
    public String  getSalary() {
        this.rate = rate;
        this.hours = hours;
        int res = rate * hours;
        return "Salary of employee is: " + res;
    }

//  // Created getBonuses method to get a bonus of employee;
    public void getBonuses(){
        this.rate = rate;
        this.hours = hours;
        float res = rate * hours;
        float bonus = res/10;
        System.out.println("The bonus of employee is: " + bonus);
    }

//    Created and overridden toString method to get info of employee;
    @Override
    public String toString() {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        String inf = "Name of employee: " + name + "\nRate of employee: " + rate +
                "\nHours of employee: " +  hours;
        System.out.println(inf);
        return inf;

    }
//  Created getTotalSum method to get total salary of all employees;
    public int getTotalSum(){
        this.rate = rate;
        this.hours = hours;
        int res = rate * hours;
        return totalSum + res;
    }


}
