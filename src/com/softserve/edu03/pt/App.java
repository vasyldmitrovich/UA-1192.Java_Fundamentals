package com.softserve.edu03.pt;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int num1 = getNumber("Enter the first number: ");
        int num2 = getNumber("Enter the second number: ");

        int total = getTotal(num1, num2);
        int average = getAverage(num1, num2);

        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);

        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        // Move this logic to some method and call this method here
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name, rate and hours for employee " + (i + 1) + ":");
            String name = scanner.nextLine();
            BigDecimal rate = scanner.nextBigDecimal();
            BigDecimal hours = scanner.nextBigDecimal();
            scanner.nextLine();
            employees[i] = new Employee(name, rate, hours);
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Total salary of all employees: " + Employee.getTotalSum());

    }

    public static int getTotal(int a, int b) {
        return a + b;
    }

    public static int getAverage(int a, int b) {
        return (a + b) / 2;
    }

    public static int getNumber(String prompt) {// Good method
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
}