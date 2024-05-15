package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task2 {// Why class have name Task2, class should have another name
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0;

    public Task2() {
    }

    public Task2(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public Task2(String name, double rate) {
        this(name, rate, 0);
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.10;
    }

    public String toString() {
        return "Employee name: " + name + ", Salary: " + getSalary();
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void main(String[] args) {// Move to App.java file
        Scanner scanner = new Scanner(System.in);

        Task2[] employees = new Task2[3];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter employee details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Hours: ");
            double hours = scanner.nextDouble();
            scanner.nextLine(); // Clear scanner buffer
            employees[i] = new Task2(name, rate, hours);
        }

        System.out.println("\nEmployees information:");
        for (Task2 employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nTotal salary of all employees: " + getTotalSum());

        scanner.close();
    }
}

