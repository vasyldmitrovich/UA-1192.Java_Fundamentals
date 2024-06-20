package com.softserve.edu07.hw.hw1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {// this task is very nice
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("0001", "Andrew", "1234HJK1234", 5000.00);
        employees[1] = new ContractEmployee("0002", "Julia", "765GHJHG66556", 50.00, 160);
        employees[2] = new SalariedEmployee("0003", "Roman", "65767FGF654", 4500.00);
        employees[3] = new ContractEmployee("0004", "Vasyl", "ASD576876DSA123", 60.00, 150);

        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.calculatePay(), e1.calculatePay()));

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId() + ", Name: " + employee.getName() +
                    ", Average Monthly Wage: " + employee.calculatePay());
        }
    }
    }
