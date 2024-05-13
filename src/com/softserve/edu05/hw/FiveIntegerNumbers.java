package com.softserve.edu05.hw;

import java.util.Scanner;

public class FiveIntegerNumbers {
    public static final Scanner scanner = new Scanner(System.in);
    private static final int[] arrOfFiveNumbers = new int[5];

    public static void getPrompt(String prompt) {
        for (int i = 0; i < arrOfFiveNumbers.length; i++) {
            System.out.println(prompt);
            arrOfFiveNumbers[i] = scanner.nextInt();
        }
    }

    public static int findSecondPos() {
        int count = 0;
        int secondPos = 0;
        for (int i = 0; i < arrOfFiveNumbers.length; i++) {
            if (arrOfFiveNumbers[i] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Position of second positive number is: " + (i + 1));
                secondPos = i + 1;
                break;
            }
        }
        return secondPos;
    }

    public static int findMinAndPos() {
        int minValue = arrOfFiveNumbers[0];
        int imin = 0;
        for (int i = 1; i < arrOfFiveNumbers.length; i++) {
            if (arrOfFiveNumbers[i] < minValue) {
                minValue = arrOfFiveNumbers[i];
                imin = i;
            }
        }
        System.out.println("Minimum = " + minValue + " is in " + (imin + 1) + " position");
        return minValue;
    }

    public static int findProdEven() {
        int prod = 1;
        for (int i = 0; i < arrOfFiveNumbers.length; i++) {
            if (arrOfFiveNumbers[i] == 0) {
            } else if (arrOfFiveNumbers[i] % 2 == 0) {
                prod = prod * arrOfFiveNumbers[i];
            }
        }
        System.out.println("The product of even numbers is:" + prod);
        return prod;
    }
}
