package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeUtils {

    private static final Scanner SCAN = App.SCAN;

    public static Employee input() throws NumberFormatException {
        System.out.print("Input employee's name: ");
        String name = SCAN.nextLine();

        System.out.print("Input employee's department: ");
        int department = Integer.parseInt(SCAN.nextLine());

        System.out.print("Input employee's salary: ");
        double salary = Double.parseDouble(SCAN.nextLine());

        return new Employee(name, department, salary);
    }

    //can be simplified with List
    public static Employee[] filterByDepartment(int department, Employee... employees) {
        Employee[] filtered = new Employee[employees.length];
        int lastIndex = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                filtered[lastIndex++] = employee;
            }
        }
        return Arrays.copyOf(filtered, lastIndex);
    }

    public static void sortBySalaryDesc(Employee... employees) {
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

    public static void printEmployees(Employee... employees) {
        System.out.println("{");
        for (Employee employee : employees) {
            System.out.println("\t" + employee.toString());
        }
        System.out.println("}");
    }
}
