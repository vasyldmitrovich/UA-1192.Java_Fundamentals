package com.softserve.edu04.hw;

import java.util.Scanner;

public class hw2 {// Name of class should start from Uppercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three integer numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        int min = findMin(num1, num2, num3);
        int max = findMax(num1, num2, num3);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    private static int findMax(int num1, int num2, int num3) {
        int max1 = Math.max(num1, num2);
        int max = Math.max(max1, num3);

        return max;

        //But better do like this:
        //return Math.max(Math.max(num1, num2), num3);
    }

    private static int findMin(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}
