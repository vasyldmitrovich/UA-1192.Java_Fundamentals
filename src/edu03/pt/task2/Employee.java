package edu03.pt.task2;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0;

    // Default constructor
    public Employee() {

    }

    // Constructor with parameters
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = getSalary();
    }

    //Properties to access private fields
    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    //Method to calculate salary
    public double getSalary() {
        return rate * hours;
    }

    //Method to calculate bonuses (10% of salary)
    public double getBonuses() {
        return getSalary() * 0.1;
    }

    //Method to output information about the employee
    public String toString() {
        return "Employee " + '\n' +
                "name = " + name + '\n' +
                "rate = " + rate + '\n' +
                "hours = " + hours + '\n' +
                "salary = " + totalSum;
    }
}




