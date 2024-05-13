package com.softserve.edu05.hw;

import java.util.Arrays;

public class FiveIntegers {
    public static int findSecondPositive(int[] array) {

        int secondPositive = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
                if (count == 2) {
                    secondPositive = i;
                    break;
                }
            }
        }
        return secondPositive + 1;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMinPos(int[] array) {
        int min = array[0];
        int minPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minPos = i;
            }
        }
        return minPos + 1;
    }

    public static int findEvenProduct(int[] array) {
        int evenProduct = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                evenProduct *= array[i];
            }
        }
        return evenProduct;
    }
}




