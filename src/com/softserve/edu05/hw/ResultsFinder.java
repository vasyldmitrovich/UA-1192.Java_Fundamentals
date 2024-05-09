package com.softserve.edu05.hw;

import java.util.Scanner;

public class ResultsFinder {
    public static void task() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input integer number: ");
            arr[i] = scanner.nextInt();
        }

        int secondPositivePosition = 0;
        int min = 0;
        int minPosition = 0;
        int positiveCount = 0;
        int productOfEvenNumbers = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0 && positiveCount != 2) {
                positiveCount++;
            }

            if (positiveCount == 2 && secondPositivePosition == 0) {
                secondPositivePosition = i;
            }

            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }

            if (arr[i] != 0 && arr[i] % 2 == 0) {
                productOfEvenNumbers *= arr[i];
            }

        }

        System.out.println("Second positive position: " + secondPositivePosition);
        System.out.println("Min value: " + min);
        System.out.println("Min position: " + minPosition);
        System.out.println("Product of even number exclude 0: " + productOfEvenNumbers);
    }
}
