package com.softserve.edu03.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppHw32 {//Good
/*
    Java console application with method to find the smallest number among three integer numbers.
 */

    public static void main(String[] args) {
        double[] numbers = new double[3];

        System.out.println("Input first number: ");
        numbers[0] = getValue();
        System.out.println("Input second number: ");
        numbers[1] = getValue();
        System.out.println("Input third number: ");
        numbers[2] = getValue();


        System.out.println("The smallest number is " + getMin(numbers));
    }

    private static double getMin(double[] args) {
        double min = args[0];
        for (int i = 0; i < 3; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    private static double getValue() {
        Scanner scanner = new Scanner(System.in);
        double value;
        try {
            value = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println("You should enter the number, please try again: ");
            return getValue();
        }
        return value;
    }
}
