package com.softserve.edu03.pt;

import java.util.Scanner;

public class App {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        double firstNumber = getNumber("Enter the first number: ");
        double secondNumber = getNumber("Enter the second number: ");
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + getTotal(firstNumber, secondNumber));
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + getAverage(firstNumber, secondNumber));
    } // Ok

    public static void task2() {
        Employee administrator = new Employee("John", 10, 40);
        Employee manager = new Employee("Lisa", 8, 30);
        Employee security = new Employee("Daniel", 5, 24);

        System.out.println(administrator);
        System.out.println(manager);
        System.out.println(security);

        System.out.println("Total salary of all employees: " + Employee.getTotalSum());
    }

    public static double getTotal(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double getAverage(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public static double getNumber(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    } // This is very nice decision

}
