package com.softserve.edu12_excep.pt;

import java.util.Scanner;

public class Pt_01 {
    public static void main(String... args) {
        while (true) {
            try {
                int a = readInt("Enter side a: ");
                int b = readInt("Enter side b: ");

                int area = squareRectangle(a, b);
                System.out.println("The rectangle area is " + area);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static int readInt(String promt) {
        var scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(promt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("It should be a number");
            }
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a < 0 | b < 0) {
            throw new IllegalArgumentException(
                    "The sides shoudn`t be negative"
            );
        }
        return a * b;
    }
}
