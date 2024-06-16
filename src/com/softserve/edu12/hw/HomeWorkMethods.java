package com.softserve.edu12.hw;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkMethods {
    private final Scanner SCANNER = new Scanner(System.in);

    public void div() {
        double a = input("Enter the first num:");
        while (true) {
            try {
                double b = input("Enter the second num:");
                if (b == 0) {
                    throw new ArithmeticException("You cannot divide by zero");
                }
                double res = a / b;
                if (res == (int) res) {
                    System.out.printf("The result of division is: %.0f%n", res);
                } else System.out.printf("The result of division is: %.2f%n", res);
                return;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double input(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Double.parseDouble(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You need to input a number ...");
            }
        }
    }

    public void runTask2(int start, int end) {
        System.out.printf("Input numbers in range %d - %d:%n", start, end);
        int[] arr = new int[10];
        arr[0] = readNumber(1, 100);
        for (int i = 1; i < arr.length; i++) {
            try {
                arr[i] = readNumber(1, 100);
                if (arr[i] <= arr[i - 1]) {
                    i--;
                    throw new IllegalArgumentException("Number must be bigger than previous");
                } else System.out.println(arr[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("Numbers that passed the condition >1<100 is: %n%s", Arrays.toString(arr));
    }

    public int readNumber(int start, int end) {
        while (true) {
            try {
                int input = takeNum(start, end);
                return input;
            } catch (NumberFormatException e) {
                System.out.println("You need to input a number ...");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int takeNum(int start, int end) throws IllegalArgumentException {
        int input = Integer.parseInt(SCANNER.nextLine());
        if (input < start || input > end) {
            throw new IllegalArgumentException("Number is out of bound");
        } else return input;
    }
}


