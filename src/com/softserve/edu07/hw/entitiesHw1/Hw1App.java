package com.softserve.edu07.hw.entitiesHw1;

import java.util.Arrays;

public class Hw1App {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Employee[] employees = {
                new ContractEmployee("Petya", "20", 24, 140, 400),
                new ContractEmployee("Vanya", "25", 22, 120, 300),
                new ContractEmployee("Dima", "22", 21, 190, 250),
                new SalariedEmployee("Pasha", "12", 4, 23000),
                new SalariedEmployee("Oksana", "14", 1, 3000),
                new SalariedEmployee("Polina", "15", 2, 18000),
        };
        System.out.println("Array before sorting:");
        showEmployee(employees);
        System.out.println("____________________________");
        arrSort(employees);
        System.out.println("Array after sorting:");
        showEmployee(employees);
    }

    public static Employee[] arrSort(Employee[] employees) {

        Arrays.sort(employees, (a, b) -> {
            double payA = ((Payment) a).calculatePay();
            double payB = ((Payment) b).calculatePay();
            return Double.compare(payB, payA);
        });
        return employees;
    }
    public static void showEmployee(Employee[]employees){
        for (Employee employee : employees) {
            System.out.println("Employee " + employee.getName() +
                    " with identification " + employee.getEmployeeId() +
                    "\nHave salary:" + ((Payment) employee).calculatePay());
        }
    }
}
