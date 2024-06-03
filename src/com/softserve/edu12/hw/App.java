package com.softserve.edu12.hw;

import java.util.Scanner;

public class App {

    protected static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {// Ok
        System.out.println("Task 1");
        demonstrateDivTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateBoundsTask();
    }

    private static void demonstrateDivTask() {
        try {
            double a = inputDouble("Input first number: ");
            double b = inputDouble("Input second number: ");
            double result = NumberUtils.div(a, b);
            System.out.printf("%.2f / %.2f = %.2f%n", a, b, result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument. It isn't double");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }

    private static void demonstrateBoundsTask() {
        int start = 1;
        int end = 100;
        int numbersCount = 10;

        while (numbersCount > 0) {
            try {
                int number = NumberUtils.readNumber(start, end);
                System.out.printf("Range [%d, %d], entered number: %d%n",
                        start, end, number);
                start = number;
                numbersCount--;
            } catch (NumberFormatException e) {
                System.out.println("Not integer number entered");
                System.out.println(e.getMessage());
            } catch (NumberUtils.OutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static double inputDouble(String prompt) throws NumberFormatException {
        System.out.print(prompt);
        return Double.parseDouble(SC.nextLine().replace(',', '.'));
    }
}
