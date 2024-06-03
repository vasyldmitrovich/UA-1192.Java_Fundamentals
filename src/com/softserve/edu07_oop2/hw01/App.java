package com.softserve.edu07_oop2.hw01;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {// Good
        Employee[] employees = {
                new SalariedEmployee("01AD00", "Anna", "AA23456", 60, 120),
                new SalariedEmployee("02AD32", "Anastasiia", "AI23242", 55, 145),
                new ContractEmployee("03AD10", "Oleksandr", "EE12345", 5000),
                new ContractEmployee("04AM00", "Vasyl", "UD12345", 3500)
        };

        for (Employee employee : employees) {
            System.out.println("Employee ID is: " + employee.getEmployeeId() +
                    ". Employee name is: " + employee.getName() +
                    ". Average monthly wage of employee is: " + employee.calculatePay());
        }

        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());// Interesting, nice
    }
}

