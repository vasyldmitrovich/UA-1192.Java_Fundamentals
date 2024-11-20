package com.softserve.edu05;

import java.util.Arrays;

public class BubbleSort {

    /** Bubble sort algorithm
     * On the right side of array is the bigger element
     * How we can to improve bubble sort algorithm
     * 1. We can sort only left part of array, without sorted elements
     * 2. And on each step, we can make passing from left to right -> and right to left <-
     * On bubble sort algorithm was created another sorted algorithm
     * */
    public static void bubbleSort(int[] arr) {
        int count = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    /*int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;*/
                    arr[i] = arr[i] + arr[i + 1] - (arr[i + 1] = arr[i]);
                    count++;
                }
            }
            System.out.println("arr = " + Arrays.toString(arr));
        }
        System.out.println("How many operations = " + count);
    }
}
