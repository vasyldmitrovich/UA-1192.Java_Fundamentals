package com.softserve.edu05.pt;

import java.util.Random;

public class Task3Methods {
    public static int[] generateRandom(int quantity) {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-99, 100);
        }
        return arr;
    }

    public static int getBiggestNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static long sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int countNegative(int[] arr) {
        int negativeNum = 0;
        for (int i : arr) {
            if (i < 0) {
                negativeNum++;
            }
        }
        return negativeNum;
    }

    public static int countPositive(int[] arr) {
        int positiveNum = 0;
        for (int i : arr) {
            if (i > 0) {
                positiveNum++;
            }
        }
        return positiveNum;
    }


}
