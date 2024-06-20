package com.softserve.edu12_excep.hw.hw1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input two double numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Call the div() method to perform division
            div(num1, num2);

        } catch (InputMismatchException e) {
            System.out.println("Input error: Please enter valid double numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }

    // Method to perform division
    public static void div(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double result = num1 / num2;
        System.out.println("Division result: " + result);
    }
}

