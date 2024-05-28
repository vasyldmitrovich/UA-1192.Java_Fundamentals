package com.softserve.edu07_oop2.hw.hw1;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        // Create an array of employees
        Employee[] employees = new Employee[]{
                new SalariedEmployee("1", "123-45-6789", 5000),
                new ContractEmployee("2", "987-65-4321", 20, 160),
                new ContractEmployee("3", "654-32-1098", 25, 180),
                new SalariedEmployee("4", "456-78-9012", 6000),
                new ContractEmployee("5", "321-98-7654", 22, 170)
        };

        // Sort the array in descending order of average monthly wage
        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        // Output employee ID, name, and average monthly wage
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Average Monthly Wage: " + employee.calculatePay());
            System.out.println();
        }
    }
}
