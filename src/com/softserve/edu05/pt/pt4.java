package com.softserve.edu05.pt;

import java.util.Scanner;

public class pt4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department Number: ");
            int departmentNumber = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(name, departmentNumber, salary);
        }

        System.out.println("\nEnter department number to filter employees: ");
        int departmentFilter = scanner.nextInt();
        System.out.println("Employees of department " + departmentFilter + ":");
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentFilter) {
                System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
            }
        }

        System.out.println("\nEmployees sorted by salary in descending order:");
        sortBySalary(employees);
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }

    private static void sortBySalary(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }
}
