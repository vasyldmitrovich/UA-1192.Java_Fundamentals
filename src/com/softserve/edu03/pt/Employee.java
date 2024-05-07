package com.softserve.edu03.pt;
import java.util.Scanner;

public class Employee {

    private static double totalSum = 0.0;

    private int hours;
    private String name;
    private double rate;

    public Employee () {}

    public Employee (String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public static void main (String [] args) {// This method should not be here, move to file for example App.java
        Employee employee1 = new Employee();
        employee1.setName("Anna");
        employee1.setRate(11);
        employee1.setHours(10);

        Employee employee2 = new Employee();
        employee2.setName("Oleksandr");
        employee2.setRate(25);
        employee2.setHours(24);

        Employee employee3 = new Employee();
        employee3.setName("Anastasiia");
        employee3.setRate(9);
        employee3.setHours(30);

        System.out.println("The first employee " +employee1);
        System.out.println("The second employee " +employee2);
        System.out.println("The third employee " +employee3);

        System.out.println("Total salary of all employees with bonuses: " + Employee.getTotalSum());

    }

    public static final double BonusRate = 0.1;

    public double getSalary(){
       return getRate() * getHours();
    }

    public double getBonuses () {
        return BonusRate * getSalary ();
    }

    // Move this method at the bottom of class, this method should be after getters and setters
    public String toString() {
        return "Employee {" +
                "hours=" + hours +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", bonuses=" +getBonuses() +
                ", salary=" +getSalary() +
                '}';
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum  += newSalary - oldSalary;

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
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum  += newSalary - oldSalary;

    }
    public static double getTotalSum() {
        return (1 + BonusRate) * totalSum;

    }


}
