package com.softserve.edu12.hw;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTask {

    public static final Scanner SCANNER = new Scanner(System.in);

    public void task1() {

        while (true) {
            try {
                double a = getPrompt("Enter  \"a\"");
                double b = getPrompt("Enter  \"b\"");
                double result = div(a, b);
                System.out.println("a/b= " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void task2() {
        int start = 1;
        int end = 100;
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = readNumber(start, end, "Enter number");
        }
        System.out.println(Arrays.toString(arr));

    }

    private static double div(double a, double b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    private int readNumber(int start, int end, String prompt)
            throws NumberFormatException, IndexOutOfBoundsException {

        int number;
        while (true) {
            try {
                System.out.println(prompt);
                number = Integer.parseInt(SCANNER.nextLine());
                if (number < start || number > end) {
                    throw new IndexOutOfBoundsException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Error entered value not number");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Number out of bound (1;100)");
            }
        }
    }

    private double getPrompt(String prompt) {

        while (true) {
            try {
                System.out.println(prompt);
                return Double.parseDouble(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error entered value not number");
            }
        }
    }
}