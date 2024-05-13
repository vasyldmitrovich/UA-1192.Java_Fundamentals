package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {// Good
    private static final Scanner scanner = new Scanner(System.in);

    public static void goTask3() {
        int[] array = createArr();
        System.out.println("Your array: " + Arrays.toString(array));
        findSecondPoz(array);
        findMin(array);
        productCalculate(array);
    }

    public static int[] createArr() {
        System.out.println("Enter 5 numbers");
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findSecondPoz(int[] array) {
        int counter = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
            if (counter == 2) {
                index = i;
                System.out.printf("Your second positive number is %d which is in position = %d\n", array[i], index + 1);
                return index+1;
            }
        }
        if (counter != 2) {
            System.out.println("We haven`t two positive numbers");
        }
        return -1;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.printf("Your min value is %d and its in position = %d\n", min, index + 1);
        return min;
    }

    public static int productCalculate(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2 == 0 && array[i] != 0)) {
                product *= array[i];
            }
        }
        if (product > 1) {
            System.out.println("The product of all the entered even numbers = " + product);

        } else {
            System.out.println("There are no even numbers in the array.");
        }
        return product;

    }
}
