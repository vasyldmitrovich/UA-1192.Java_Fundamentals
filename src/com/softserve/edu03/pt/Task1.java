package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task1 {
    public static int getTotal(int first, int second) {
        return first + second;
    }
    public static double getAverage(int first, int second) {
        return (double) (first + second) / 2;
    }

    public static int getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = getNumber(scanner, "Enter the first number: ");
        int secondNumber = getNumber(scanner, "Enter the second number: ");

        int sum = getTotal(firstNumber, secondNumber);
        double average = getAverage(firstNumber, secondNumber);

        System.out.printf("The sum of %d and %d is %d\n", firstNumber, secondNumber, sum);
        System.out.printf("The average of %d and %d is %.1f\n", firstNumber, secondNumber, average);

        scanner.close();
    }
}
