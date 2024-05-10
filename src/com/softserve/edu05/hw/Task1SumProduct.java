package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1SumProduct {
    public static void task1SumProduct() {
        Scanner sc = new Scanner(System.in);
        int[] numbersArray = new int[10];
        System.out.println("Enter 10 int numbers: ");

        for (int i = 0; i < 10; i++) {
            numbersArray[i] = sc.nextInt();
        }
        boolean positive = true;
        for (int i = 0; i < 5; i++) {
            if (numbersArray[i] <= 0) {
                positive = false;
                break;
            } else {
                positive = true;
            }
        }

        int result = 0;
        if (positive) {
            for (int i = 0; i < 5; i++) {
                result += numbersArray[i];
            }
        } else {
            result = 1;
            for (int i = 5; i < 10; i++) {
                result *= numbersArray[i];
            }
        }
        System.out.println(result);
        sc.close();
    }
}

