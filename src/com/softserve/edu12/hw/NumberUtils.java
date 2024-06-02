package com.softserve.edu12.hw;

import java.util.Scanner;

public class NumberUtils {

    private static final Scanner SC = App.SC;

    public static double div(double a, double b) throws ArithmeticException {
        return a / b;
    }

    public static int readNumber(int start, int end)
            throws NumberFormatException, OutOfBoundsException {
        System.out.print("Input next number: ");
        int number = Integer.parseInt(SC.nextLine());

        if (number < start || number > end) {
            throw new OutOfBoundsException(number, start, end);
        }

        return number;
    }

    public static class OutOfBoundsException extends Exception {
        public OutOfBoundsException(int number, int start, int end) {
            super(String.format("Number %d is out of bounds [%d, %d]",
                    number, start, end));
        }
    }
}
