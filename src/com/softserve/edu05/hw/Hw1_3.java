package com.softserve.edu05.hw;

import java.util.Arrays;

public class Hw1_3 {
    public static void hwDoTask3() {
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Hw1_1.getNumber();
        }
//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        findSecondPos(arr);
        findArrMin(arr);
        arrMultiply(arr);
    }

    public static void findSecondPos(int[] array) {
        int counter = 0;
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
            if (counter == 2) {
                position = i;
                System.out.printf("Second positive number is %d" + "\nIt is on %d position.\n",
                        array[i], position + 1);
            }
        }
        if (counter < 2) {
            System.out.println("There are not 2 positive numbers.\n");
        }
    }

    public static void findArrMin(int[] arr) {
        int minValue = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                position = i;
            }
        }
        System.out.printf("Minimal value in array is: %d\nIt is on %d position in array\n",
                minValue, position + 1);
    }

    public static void arrMultiply(int[] arr) {
        int multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 == 0) && arr[i] != 0) {
                multiply *= arr[i];
            }
        }
        if (multiply >= 1) {
            System.out.printf("Multiply of all even numbers equals: %d", multiply);
        } else System.out.println("There are not even numbers in array.");
    }
}
