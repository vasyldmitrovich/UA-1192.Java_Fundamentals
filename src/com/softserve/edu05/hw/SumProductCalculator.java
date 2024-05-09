package com.softserve.edu05.hw;

import java.util.Scanner;

public class SumProductCalculator {
    public static void task() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input integer number: ");
            arr[i] = scanner.nextInt();
        }

        int result = 0;
        boolean isSum = true;

        for (int i = 0; i < arr.length; i++) {
            if (isSum) {
                result += arr[i];
                if (i < 5 && arr[i] < 0) {
                    result = 0;
                    isSum = false;
                }
                if (i >= 5) {
                    break;
                }
            } else {
                if (i >= 5) {
                    result = result == 0 ? arr[i] : result * arr[i];
                }
            }
        }

        System.out.println("Result: " + result);
    }
}
