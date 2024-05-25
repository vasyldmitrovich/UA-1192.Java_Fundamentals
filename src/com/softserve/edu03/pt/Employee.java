package com.softserve.edu03.pt;

import java.util.Scanner;

public class Employee {// Why class have name Task2, class should have another name//Fixed
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0;

    public Employee() {
    }

    public Employee(String name, double rate, double hours) {
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // Calculate the salary of an employee
    public double getSalary() {
        return rate * hours;
    }

    // Calculate bonuses (10% of salary)
    public double getBonuses() {
        return 0.1 * getSalary();
    }

    // Output information about the employee
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    // Get total sum of all salaries
    public static double getTotalSum() {
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter employee details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Hours: ");
            double hours = scanner.nextDouble();
            scanner.nextLine();
            employees[i] = new Employee(name, rate, hours);
        }

        System.out.println("\nEmployees information:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nTotal salary of all employees: " + getTotalSum());

        scanner.close();
    }
}

