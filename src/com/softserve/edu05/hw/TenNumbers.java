package com.softserve.edu05.hw;

import java.util.Scanner;

public class TenNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        boolean isPozitive = true;

        System.out.println("Enter 10 numbers");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                isPozitive = false;
                break;
            }
            sum += arr[i];
        }

        if (isPozitive) {
            System.out.println("The sum of the first 5 value " + sum);
        } else {
            for (int i = arr.length - 1; i >= arr.length - 5; i--) {
                product *= arr[i];
            }
            System.out.println("The product of last 5 value " + product);
        }
    }
}

