package com.softserve.edu05.hw05;

import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int secondPositivePosition = -1;
        int min = Integer.MAX_VALUE;
        int minPosition = -1;
        int evenProduct = 1;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                if (secondPositivePosition == -1) {
                    secondPositivePosition = i + 1;
                }
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minPosition = i + 1;
            }
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                evenProduct *= numbers[i];
            }
        }

        System.out.println("Second positive number position: " + secondPositivePosition);
        System.out.println("Minimum value: " + min + " at position: " + minPosition);
        System.out.println("Product of even numbers: " + evenProduct);


    }
}
