package com.softserve.edu05.hw;

public class Task1SumProduct {
    public static int task1SumProduct(int[] array) {
        boolean positive = true;
        for (int i = 0; i < 5; i++) {
            if (array[i] <= 0) {
                positive = false;
                break;
            } else {
                positive = true;
            }
        }

        int result = 0;
        if (positive) {
            for (int i = 0; i < 5; i++) {
                result += array[i];
            }
        } else {
            result = 1;
            for (int i = 5; i < 10; i++) {
                result *= array[i];
            }
        }
        return result;
    }
}

