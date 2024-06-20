package com.softserve.edu12_excep.hw.hw2;

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < 10; i++) {
                numbers[i] = readNumber(start, end, scanner);
            }

            System.out.println("Entered numbers:");
            for (int number : numbers) {
                System.out.println(number);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid integer number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to read and validate an integer within a specified range
    public static int readNumber(int start, int end, Scanner scanner) {
        System.out.printf("Enter a number between %d and %d: ", start, end);
        String input = scanner.nextLine().trim();

        try {
            int number = Integer.parseInt(input);
            if (number <= start || number >= end) {
                throw new IllegalArgumentException("Number must be within the range [" + start + "..." + end + "]");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid input: Please enter a valid integer number.");
        }
    }
}

