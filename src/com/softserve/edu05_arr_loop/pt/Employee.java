package com.softserve.edu05_arr_loop.pt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employee {

    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {// Move this main method to App class
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        // Create five employee objects
        employees.add(new Employee("John Doe", 1, 50000));
        employees.add(new Employee("Jane Smith", 2, 65000));
        employees.add(new Employee("Michael Brown", 1, 48000));
        employees.add(new Employee("Alice Johnson", 3, 72000));
        employees.add(new Employee("David Miller", 2, 60000));

        // Menu for user interaction
        int choice;
        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Find employees by department");
            System.out.println("2. Sort employees by salary (descending)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findEmployeesByDepartment(employees, scanner);
                    break;
                case 2:
                    sortBySalaryDescending(employees);
                    printEmployees(employees);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void findEmployeesByDepartment(ArrayList<Employee> employees, Scanner scanner) {
        System.out.print("Enter department number: ");
        int departmentNumber = scanner.nextInt();

        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in department " + departmentNumber);
        }
    }

    public static void sortBySalaryDescending(ArrayList<Employee> employees) {
        Collections.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
    }

    public static void printEmployees(ArrayList<Employee> employees) {
        System.out.println("\nEmployees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

