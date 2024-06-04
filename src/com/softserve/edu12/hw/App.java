package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

        scanner.close();
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
            String message = e.getMessage();
            System.out.println("Something went wrong" + (message == null ? "" : ": " + message));
        }
    }

    public static void task2() {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {

            while (true) {

                try {
                    int min = i * 10;
                    int max = min + 10;
                    System.out.println("Enter number " + (i + 1) + " (must be greater than " + min + " and less than " + max +"): ");
                    numbers[i] = readNumber(min, max);
                    break;
                } catch (NumberOutOfRangeException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Value should be a number");
                } catch (Exception e) {
                    String message = e.getMessage();
                    System.out.println("Something went wrong" + (message == null ? "" : ": " + message));
                }

            }

        }

        System.out.println("You entered valid numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static double div (double a, double b) {
        return a / b;
    }

    public static int readNumber(int start, int end) throws NumberOutOfRangeException {
        System.out.println("Input number: ");
        int number = scanner.nextInt();

        if (number > start && number < end) {
            return number;
        }

        throw new NumberOutOfRangeException();
    }
}
