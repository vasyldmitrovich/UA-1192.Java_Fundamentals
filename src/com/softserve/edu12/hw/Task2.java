package com.softserve.edu12.hw;

import java.util.InputMismatchException;

public class Task2 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int start = 1;
        int end = 100;

        NumberReader numberReader = new NumberReader();

        try {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numberReader.readNumber(start, end);
                start = numbers[i];
            }

            System.out.println("Entered numbers:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();

        } catch (InputMismatchException | NumberReader.NumberOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
