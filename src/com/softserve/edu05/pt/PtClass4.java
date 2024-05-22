package com.softserve.edu05.pt;

import java.util.Scanner;

public class PtClass4 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String... args) {
        Employee[] employees = {
                new Employee("Anna", 1, 5000),
                new Employee("Anastasiia", 2, 6500),
                new Employee("Dana", 1, 7000),
                new Employee("Dmytro", 2, 3500),
                new Employee("Oleksandr", 1, 9750),
        };

        System.out.println("Enter department number: ");
        int i = SCANNER.nextInt();
        boolean found = false;
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == i) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no employees ");
        }

        System.out.println("from Table: ");

        sort(employees);
        for (var employee : employees) {
            System.out.println(employee);
        }
    }

    static void sort (Employee [] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j <employees.length - 1 - i; j ++) {
               if (employees[j].getSalary() < employees [j+1].getSalary()) {
                 var swap = employees [j+1];
                 employees [j + 1] = swap;
               }
            }
        }

    }
}

class Employee {// Move to file Employee.java
    String name;// Make fields private
    int departmentNumber;
    double salary;

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }// Order is not correct, constructors should be before getters and setters

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }
}
