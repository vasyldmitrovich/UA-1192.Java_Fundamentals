package com.softserve.edu12_excep.hw.hw3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {

    private static Scanner scanner = new Scanner(System.in);

    public static double readDouble(String prompt) {
        double number;
        while (true) {
            try {
                System.out.print(prompt);
                number = scanner.nextDouble();
                return number; // Exit loop if input is successfully parsed
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: Please enter a valid double number.");
                scanner.nextLine(); // Clear the buffer
            }
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}

