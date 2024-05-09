package com.softserve.edu05.hw;

import java.util.NoSuchElementException;

public class ArrayStatsCalculator {

    public static StatsCalculatorResult calculateStats(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int secondPositivePosition = 0;
        int min = arr[0];
        int minPosition = 0;
        int positiveCount = 0;
        int productOfEvenNumbers = 0;

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
                productOfEvenNumbers = productOfEvenNumbers == 0 ? arr[i] : productOfEvenNumbers * arr[i];
            }

        }

        if (secondPositivePosition == 0) {
            throw new NoSuchElementException("The second positive number is not present");
        }

        return new StatsCalculatorResult(secondPositivePosition, min, minPosition, productOfEvenNumbers);
    }
}
