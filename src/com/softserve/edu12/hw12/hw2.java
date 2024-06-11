package com.softserve.edu12.hw12;

import java.util.Scanner;

public class hw2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    int start = (i == 0) ? 2 : numbers[i - 1] + 1;
                    int end = (i == 9) ? 99 : 100;
                    System.out.printf("Enter number %d (between %d and %d): ", i + 1, start, end - 1);
                    numbers[i] = readNumber(scanner, start, end);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }

        System.out.println("You entered the following numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static int readNumber(Scanner scanner, int start, int end) throws Exception {
        if (!scanner.hasNextInt()) {
            scanner.next();
            throw new Exception("Input is not an integer");
        }

        int number = scanner.nextInt();

        if (number < start || number >= end) {
            throw new Exception("Input out of range");
        }

        return number;
    }
}
