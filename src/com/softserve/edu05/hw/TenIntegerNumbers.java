package com.softserve.edu05.hw;

import java.util.Scanner;

public class TenIntegerNumbers {
    public static final Scanner scanner = new Scanner(System.in);

    private static final int[] arrOfTenNumbers = new int[10];

    public static void getPrompt(String prompt) {
        for (int i = 0; i <= arrOfTenNumbers.length - 1; i++) {
            System.out.println(prompt);
            arrOfTenNumbers[i] = scanner.nextInt();
        }
    }

    public static int calcElements() {
        int countPositiv = 0;
        int result=0;
        for (int i = 0; i <= arrOfTenNumbers.length - 6; i++) {
            if (arrOfTenNumbers[i] > 0) {
                countPositiv++;
                result = result + arrOfTenNumbers[i];
            }
            if (countPositiv == 5) {
                System.out.println("First five numbers are positive, and their sum is :" + result);
            } else if (arrOfTenNumbers[i] <= 0) {
                result=1;
                for (int j = arrOfTenNumbers.length - 1; j >= arrOfTenNumbers.length - 5; j--) {
                    result = result * arrOfTenNumbers[j];
                }
                System.out.println("First five number nor all positive product of last five numbers is: " + result);
            }
        }
        return result;
    }
}
