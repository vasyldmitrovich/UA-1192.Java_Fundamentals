package com.softserve.edu03.pt;

public class App {
    public static void main(String[] args) {// Move to App.java not here
        Employee first = new Employee("Alex", 22, 40);
        Employee second = new Employee("Lise", 25, 35);
        Employee third = new Employee("Mary", 30, 45);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        double totalSum = first.getTotalSalary() + second.getTotalSalary() + third.getTotalSalary();
        System.out.println("Total salary of all employees: " + totalSum);
    }
}
