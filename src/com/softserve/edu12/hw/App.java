package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// Good
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second homework");
    }

    public static void homework1() {
        System.out.println("Enter the first number");

        try {
            double a = sc.nextDouble();
            System.out.println("Enter the second number");
            double b = sc.nextDouble();
            double result = div(a, b);
            System.out.println("The result of division is " + result);
        } catch (InputMismatchException e) {
            System.out.println("You enter non-double value");
        } catch (ArithmeticException e) {
            System.out.println("You are trying to divide by zero");

        }
    }

    public static double div(double a, double b) {
        if (a/b == Double.POSITIVE_INFINITY || a/b == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException();
        } else {
            return a / b;
        }
    }

    public static void homework2 () {
        int start = 1;
        int end = 100;
        readNumber(start, end);
    }

    public static void readNumber(int start, int end) {
        int count = 0;

        while (count != 10) {
            System.out.println("Enter the number in range [" + start + " - " + end + "]");

            try {
                int number = sc.nextInt();


                if (number < start || number > end) {
                    throw new OutOfRangeException(start, end, number);
                }

                System.out.println("You enter number " + number + " which are in range[" + start + " - " + end + "]");
                start = number;

            } catch (InputMismatchException e) {
                System.out.println("You enter non-integer value");
                sc.nextLine();
            } catch (OutOfRangeException e) {
                System.out.println(e.getMessage());
            }

            count++;
        }
    }
}
