package com.softserve.edu12.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberReader {

    public int readNumber(int start, int end) throws InputMismatchException, NumberOutOfRangeException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("Enter a number between %d and %d: ", start, end);
            int number = scanner.nextInt();

            if (number <= start || number >= end) {
                throw new NumberOutOfRangeException("Number must be strictly between " + start + " and " + end + ".");
            }

            return number;

        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw new InputMismatchException("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }
}
