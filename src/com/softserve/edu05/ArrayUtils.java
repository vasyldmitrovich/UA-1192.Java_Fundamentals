package com.softserve.edu05;
import java.util.Random;

public class ArrayUtils {
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int calculateSumOfPositives(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int countNegatives(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    public static void printMoreNegOrPos(int[] array) {
        int negativeCount = countNegatives(array);
        if (negativeCount > array.length - negativeCount) {
            System.out.println("There are more negative values in the array.");
        } else if (negativeCount < array.length - negativeCount) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}