package com.softserve.edu12.hw;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task122 {

    public static void execute() {
        int[] numbers = new int[10];
        int start = 0;

        System.out.println("Please enter 10 integer values:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d value: ", i+1);
            try {
                int number = readNumber(start, 100);
                numbers[i] = number;
                start = number;

            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
                i--;
            }

        }
        System.out.println(Arrays.toString(numbers));
    }


    public static int readNumber(int start, int end) throws IllegalArgumentException {
        int input = scan();
        if (input < start || input > end)
            throw new IllegalArgumentException(String.format("Entered value is out of [%d, %d] range", start, end));
        return input;

    }

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        int result;

        try {
            result = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integer value.");
            return scan();
        }

        return result;

    }
}
