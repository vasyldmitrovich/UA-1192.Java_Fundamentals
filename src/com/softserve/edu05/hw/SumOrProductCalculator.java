package com.softserve.edu05.hw;

public class SumOrProductCalculator {

    public static int calculateSumOrProduct(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
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
                if (i >= 4) {
                    break;
                }
            } else {
                if (i >= 5) {
                    result = result == 0 ? arr[i] : result * arr[i];
                }
            }
        }

        return result;
    }
}
