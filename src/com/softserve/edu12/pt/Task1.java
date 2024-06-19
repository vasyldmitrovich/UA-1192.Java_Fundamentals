package com.softserve.edu12.pt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter length of rectangle (a): ");
                a = scanner.nextInt();

                System.out.print("Enter width of rectangle (b): ");
                b = scanner.nextInt();

                if (a <= 0 || b <= 0) {
                    throw new IllegalArgumentException("Dimensions must be positive integers.");
                }

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }

        try {
            int area = squareRectangle(a, b);
            System.out.println("Area of the rectangle: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative.");
        }

        return a * b;
    }
}