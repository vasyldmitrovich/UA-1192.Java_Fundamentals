package com.softserve.edu03.pt;

import java.util.Scanner;

public class pt1 {
    /**
     This is a practical TASK 1.
     Methods of this class calculate the sum and average values entered

     Author: Andrew Tandyriak
     */
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) getNumber("Enter the first number: ", scanner);
        int number2 = (int) getNumber("Enter the second number: ", scanner);
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + getTotal(number1, number2));
        System.out.println("The average of " + number1 + " and " + number2 + " is " + getAverage(number1, number2));
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) /2;
    }

    public static double getNumber(String prompt, Scanner scanner) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Enter a valid number.");
            scanner.next();
            System.out.print(prompt);
        }
        return scanner.nextDouble();
    }
}