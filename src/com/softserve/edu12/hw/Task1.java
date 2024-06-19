package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (double type): ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number (double type): ");
            double num2 = scanner.nextDouble();

            Divider divider = new Divider();

            double result = divider.divide(num1, num2);
            System.out.println("Result of division: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Input error: Non-numeric input.");
        } catch (ArithmeticException e) {
            System.out.println("Calculation error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
