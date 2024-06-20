package com.softserve.edu12_excep.pt.pt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {

    private static Scanner scanner = new Scanner(System.in);

    public static int readPositiveInt(String prompt) {
        int number;
        while (true) {
            try {
                System.out.print(prompt);
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Input cannot be negative. Please enter a positive integer.");
                    continue;
                }
                return number; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear the buffer
            }
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}

