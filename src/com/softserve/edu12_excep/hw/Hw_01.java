package com.softserve.edu12_excep.hw;

import java.util.Scanner;

public class Hw_01 {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String... args) {
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

}
