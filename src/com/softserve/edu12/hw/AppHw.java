package com.softserve.edu12.hw;

import java.util.Arrays;
import java.util.Scanner;

public class AppHw {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {// Ok
        System.out.println("-".repeat(20)+"First homework"+"-".repeat(20));
        hw1();
        System.out.println("-".repeat(20)+"Second homework"+"-".repeat(20));
        hw2();
    }

    public static void hw1() {
        double first = readDouble("Enter the first value:");
        double second = readDouble("Enter the second value:");
        try {
            System.out.println("Result = " + div(first, second));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }


    }

    public static double div(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Division by zero is prohibited!");
        }
        return first / second;
    }


    private static double readDouble(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("It should be a number");
            }
        }
    }

    public static void hw2() {
        enterTenValue();
    }

    public static void enterTenValue(){
        int[] arr = new int[10];
        int start = 1;
        int end = 100;
        for (int i = 0; i < arr.length; i++) {

            while (true) {
                try {
                    int number = readNumber(start, end);
                    if (i > 0 && number <= arr[i - 1]) {
                        System.out.println("The number must be greater than " + arr[i - 1] + ". Try again.");
                    } else {
                        arr[i] = number;
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("You entered:" + Arrays.toString(arr));
    }

    public static int readNumber(int start, int end) throws IllegalArgumentException {
        int number = readInt("Enter a number between " + start + " and " + end + ":");
        if (number >= start && number <= end) {
            return number;
        } else {
            throw new IllegalArgumentException("The number is not in the range " + start + " to " + end + ".");
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("It should be an integer number. Try again.");
            }
        }
    }
}
