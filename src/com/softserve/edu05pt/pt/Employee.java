package com.softserve.edu05pt.pt;

import java.util.*;

public class Employee {

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        class Employee1 {
            private String name;
            private int departmentNumber;
            private double salary;

            public Employee1(String name, int departmentNumber, double salary) {
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
        }
        Employee1 emp1 = new Employee1("John", 1, 50000);
        Employee1 emp2 = new Employee1("Alice", 2, 60000);
        Employee1 emp3 = new Employee1("Bob", 1, 55000);
        Employee1 emp4 = new Employee1("Emma", 3, 48000);
        Employee1 emp5 = new Employee1("David", 2, 62000);

        List<Employee1> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.print("Введіть номер відділу: ");
        int department = scanner.nextInt();
        System.out.println("Працівники відділу " + department + ":");
        for (Employee1 emp : employees) {
            if (emp.getDepartmentNumber() == department) {
                System.out.println(emp.getName() + " - $" + emp.getSalary());
            }
        }
        Collections.sort(employees, Comparator.comparingDouble(Employee1::getSalary).reversed());
        System.out.println("\nПрацівники, впорядковані за заробітною платою в порядку спадання:");
        for (Employee1 emp : employees) {
            System.out.println(emp.getName() + " - $" + emp.getSalary());
        }
    }
}
