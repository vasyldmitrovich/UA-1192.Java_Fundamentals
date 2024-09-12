package com.softserve.edu05.hw05;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            if (scanner.hasNextInt()) { // Check if there's an integer input
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                // If input is not an integer, consume it and prompt again
                scanner.next();
                i--; // Decrement i to re-enter the current value
            }
        }

        int result;
        if (numbers[0] >= 0 && numbers[1] >= 0 && numbers[2] >= 0 && numbers[3] >= 0 && numbers[4] >= 0) {
            result = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        } else {
            result = numbers[5] * numbers[6] * numbers[7] * numbers[8] * numbers[9];
        }

        System.out.println("Result: " + result);


    }
}
