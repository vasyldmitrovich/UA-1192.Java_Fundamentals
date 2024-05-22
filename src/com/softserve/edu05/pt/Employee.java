package com.softserve.edu05.pt;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public static void createEmployee() {// This method should not be here, move to App class
        Employee[] employees = {
                new Employee("Jenifer", 3, 12000),
                new Employee("Mike", 1, 11000),
                new Employee("Jack", 2, 13000),
                new Employee("Bob", 3, 12000),
                new Employee("Sarah", 1, 11000),
        };
        findDepNum(employees);
        System.out.println("-".repeat(40) + "EMPLOYEE SORTING" +  "-".repeat(40));
        employeeSort(employees);
        for (var employee : employees) {
            System.out.println(employee);
        }
    }

    public static void findDepNum(Employee[] employees) {// This method should not be here, move to App class
        System.out.print("\nInput department number: ");
        boolean found = false;
        int number = App.SCANNER.nextInt();
        System.out.println("=".repeat(80));
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == number) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.printf("Department with number %d not found", number);
        }System.out.println("=".repeat(80));
    }

    public static void employeeSort(Employee[] employees) {// This method should not be here, move to App class
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", departmentNumber=" + departmentNumber + ", salary=" + salary + '}';
    }
}

