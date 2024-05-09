package com.softserve.edu05.hw;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        MonthDaysCalculator.task();
        SumProductCalculator.task();
        ResultsFinder.task();
    }

    private static void task2() {
        do {

            System.out.println("Input first number: ");
            double firstName = scanner.nextDouble();

            System.out.println("Input second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("Sum of calculated numbers: " + (firstName + secondNumber));

            System.out.println("Do you want to continue? (Y/N): ");
            String answer = scanner.next();

            if (!"Y".equals(answer)) {
                break;
            }

        } while (true);
    }
}
