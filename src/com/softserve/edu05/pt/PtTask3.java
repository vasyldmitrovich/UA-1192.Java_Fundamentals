package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class PtTask3 {
    public static void main(String... args) {
        int[] arr = genRandomNumbers(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("The max value is: " + getMax(arr));
        System.out.println("The sum of positive values is: " + sumOfPositivesNumbers(arr));
        System.out.println("The count of negative values is: " + countOfNegativesNumbers(arr));

        int countPositives = countOfPositiveNumbers(arr);
        int countNegatives = countOfNegativesNumbers(arr);
        if (countNegatives > countPositives) {
            System.out.println("There are more negative values in the array.");
        } else if (countPositives > countNegatives) {
            System.out.println("There are more positive values in the array.");
        } else {System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }

    static int [] compare(int[] arr) {
        int countPositives = countOfPositiveNumbers(arr);
        int countNegatives = countOfNegativesNumbers(arr);
        if (countNegatives > countPositives) {
            System.out.println("There are more negative values in the array.");
        } else if (countPositives > countNegatives) {
            System.out.println("There are more positive values in the array.");
        } else {System.out.println("There are an equal number of positive and negative values in the array.");
        }
        return arr;
    }

    static int[] genRandomNumbers(int quantity) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-99, 100);
        }
        return arr;
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static long sumOfPositivesNumbers(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int countOfNegativesNumbers(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count ++;
            }
        }
        return count;
    }

    static int countOfPositiveNumbers(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count ++;
            }
        }
        return count;
    }

}


