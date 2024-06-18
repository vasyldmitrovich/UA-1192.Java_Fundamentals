package com.softserve.edu12.hw;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {// Ok
        System.out.println("=".repeat(20) + "Task 1" + "=".repeat(20));
        task1();
        System.out.println("=".repeat(20) + "Task 2" + "=".repeat(20));
        task2();
    }


    public static void task1() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number for dividing: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number for dividing: ");
            double num2 = sc.nextDouble();
            double result = div(num1, num2);
            System.out.println("The result of dividing is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("You should input a number!");
        }


    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("You cannot divide by zero!");
        }
        return num1 / num2;
    }

    public static void task2() {
        int[] numbersArray = new int[10];
        for (int i = 0; i < numbersArray.length; i++) {
            while (true) {
                try {
                    int num = readNumber(1, 100);
                    if (i > 0 && num <= numbersArray[i - 1]) {
                        System.out.println("Input another num. It has to be bigger than " + numbersArray[i - 1]);

                    } else {
                        numbersArray[i] = num;
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Number is not in the range! Try one more time: ");
                } catch (InputMismatchException e) {
                    System.out.println("It should be an int number! Try one more time: ");
                }
            }

        }
        System.out.println("Created array: " + Arrays.toString(numbersArray));
    }

    public static int readNumber(int start, int end) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num > start && num < end) {
            return num;
        } else {
            throw new IllegalArgumentException();
        }

    }

}
