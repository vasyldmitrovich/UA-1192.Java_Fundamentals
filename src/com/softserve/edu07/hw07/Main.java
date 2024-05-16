package com.softserve.edu07.hw07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding some sample employees
        employees.add(new SalariedEmployee("001", "123-45-6789", 3000));
        employees.add(new ContractEmployee("002", "987-65-4321", 25, 160));
        employees.add(new ContractEmployee("003", "456-78-9012", 20, 180));
        employees.add(new SalariedEmployee("004", "321-98-7654", 3500));

        // Sorting employees by average monthly wage in descending order
        Collections.sort(employees, Comparator.comparingDouble((Employee e) -> {
            if (e instanceof SalariedEmployee) {
                return ((SalariedEmployee) e).calculatePay();
            } else if (e instanceof ContractEmployee) {
                return ((ContractEmployee) e).calculatePay();
            }
            return 0;
        }).reversed());

        // Outputting employee details
        for (Employee employee : employees) {
            double avgMonthlyWage;
            if (employee instanceof SalariedEmployee) {
                avgMonthlyWage = ((SalariedEmployee) employee).calculatePay();
            } else {
                avgMonthlyWage = ((ContractEmployee) employee).calculatePay();
            }
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Average Monthly Wage: " + avgMonthlyWage);
            System.out.println();
        }
    }
}
