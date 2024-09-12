package com.softserve.edu12.pt12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class pt1 {


    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Both a and b must be non-negative integers.");
        }
        return a * b;
    }

    public static void main(String[] args) {// Ok
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value for a: ");
            int a = scanner.nextInt();

            System.out.print("Enter the value for b: ");
            int b = scanner.nextInt();

            int area = squareRectangle(a, b);
            System.out.println("The area of the rectangle is: " + area);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
