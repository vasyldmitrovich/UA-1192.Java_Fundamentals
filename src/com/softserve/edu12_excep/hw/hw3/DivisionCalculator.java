package com.softserve.edu12_excep.hw.hw3;

public class DivisionCalculator {

    public static void main(String[] args) {
        try {
            double num1 = InputValidator.readDouble("Enter the first number: ");
            double num2 = InputValidator.readDouble("Enter the second number: ");

            div(num1, num2);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } finally {
            InputValidator.closeScanner();
        }
    }

    public static void div(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        double result = num1 / num2;
        System.out.println("Division result: " + result);
    }
}

