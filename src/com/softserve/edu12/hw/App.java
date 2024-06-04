package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Demonstrate task 1");
//        task1();

        System.out.println("Demonstrate task 2");
        task2();
    }

    public static void task1() {
        try {
            System.out.println("Input first number");
            double firstNumber = scanner.nextDouble();

            System.out.println("Input second number");
            double secondNumber = scanner.nextDouble();

            double result = div(firstNumber, secondNumber);

            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Value should be a number");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static void task2() {
        try {
            int number = readNumber(1, 10);
            System.out.println("The number is: " + number);
        } catch (NumberOutOfRangeException e) {
            throw new RuntimeException(e);
        } catch (InputMismatchException e) {
            System.out.println("Value should be a number");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static double div (double a, double b) {
        return a / b;
    }

    public static int readNumber(int start, int end) throws NumberOutOfRangeException {
        System.out.println("Input number: ");
        int number = scanner.nextInt();

        if (number >= start && number <= end) {
            return number;
        }

        throw new NumberOutOfRangeException();
    }
}
