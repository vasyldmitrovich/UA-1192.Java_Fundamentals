package com.softserve.edu12.hwork;

import java.util.Scanner;

public class AppHw {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        try {
            System.out.println("Enter the first number: ");
            double firsNum = scan.nextDouble();

            System.out.println("Enter the second number: ");
            double secondNum = scan.nextDouble();

            double result = div(firsNum, secondNum);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Please enter valid double numbers.");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot be divided by zero. Enter another number.");
        }
        return a / b;
    }

    public static void task2() {
        int[] numbers = new int[10];
        int previousNumber = 1;

        for (int i = 0; i < 10; i++) {
            try {
                int currentNumber = readNumbers(previousNumber + 1, 100);
                numbers[i] = currentNumber;
                previousNumber = currentNumber;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        System.out.println("Entered numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static int readNumbers(int start, int end) throws IllegalArgumentException {// Ok this is interesting
        System.out.print("Enter an integer number: ");
        String intNum = scan.nextLine();

        try {
            int number = Integer.parseInt(intNum);
            if (number >= start && number <= end) {
                return number;
            } else {
                throw new IllegalArgumentException("Number is not in the specified range.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid integer.");
        }
    }
}
