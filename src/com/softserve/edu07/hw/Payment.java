package com.softserve.edu07.hw;

import java.util.Arrays;
import java.util.Comparator;

interface Payment {
    double calculatePay();
}

abstract class Employee {
    String employeeId;// Make private and add getters and setters
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
}

class SalariedEmployee extends Employee implements Payment {// make implements Payment in class Employee
    String socialSecurityNumber;// Make private and add getters and setters
    double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}

class ContractEmployee extends Employee implements Payment {// the same
    double federalTaxIdMember;// Make private and add getters and setters
    double hourlyRate;
    int hoursWorked;

    public ContractEmployee(String employeeId, String name, double federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

 class Main {// Move this logic to class App
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        // Додавання працівників з різними формами оплати
        employees[0] = new SalariedEmployee("1", "Alice", "123-45-6789", 3000);
        employees[1] = new SalariedEmployee("2", "Bob", "987-65-4321", 3500);
        employees[2] = new ContractEmployee("3", "Charlie", 123456789, 20, 160);
        employees[3] = new ContractEmployee("4", "David", 987654321, 25, 150);

        // Сортування працівників за заробітною платою у порядку спадання
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                double pay1 = ((Payment) emp1).calculatePay();
                double pay2 = ((Payment) emp2).calculatePay();
                return Double.compare(pay2, pay1);
            }
        });

        // Виведення інформації про працівників
        for (Employee emp : employees) {
            System.out.println("Employee ID: " + emp.employeeId);
            System.out.println("Name: " + emp.name);
            System.out.println("Average Monthly Wage: " + ((Payment) emp).calculatePay());
            System.out.println(); // Порожній рядок для розділення інформації про кожного працівника
        }
    }
}
