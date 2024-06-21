package com.softserve.edu12.hw.hw2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        try {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = readNumber(1, 100);
                if (i > 0 && numbers[i] <= numbers[i - 1]) {
                    throw new IllegalArgumentException("Numbers must be increasing. TRY AGAIN");
                }
            }

            System.out.println("Numbers entered:");
            for (int number : numbers) {
                System.out.println(number);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.printf("Enter a number between %d and %d: ", start, end);
                int number = Integer.parseInt(scanner.nextLine());

                if (number <= start || number >= end) {
                    throw new IllegalArgumentException("Number must be within the range [" + start + "..." + end + "].");
                }

                return number;

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
