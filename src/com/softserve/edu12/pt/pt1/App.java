package com.softserve.edu12.pt.pt1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = getValidIntegerInput(scanner, "Enter the length of the rectangle (a): ");
            int b = getValidIntegerInput(scanner, "Enter the width of the rectangle (b): ");

            int area = squareRectangle(a, b);
            System.out.println("Area of the rectangle: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative.");
        }
        return a * b;
    }

    public static int getValidIntegerInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Input a valid integer.");
                scanner.next();
            }
        }
    }
}
