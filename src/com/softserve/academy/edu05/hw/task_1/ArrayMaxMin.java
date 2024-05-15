package com.softserve.academy.edu05.hw.task_1;

import java.util.Scanner;

public class ArrayMaxMin {
    /**
     * Create a program (in different java documents) that prompts the user to enter:
     * • 5 integer numbers and find:
     * o position of second positive number;
     * o minimum value and its position in the array.
     * o calculate the product of all entered even numbers (exclude 0 from even if entered by
     * user).
     */
    public static int[] execute() {
        System.out.println("Enter 5 integer numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int secondPositiveNumberIndex = -1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int product = 1;
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                if (secondPositiveNumberIndex == -1) {
                    secondPositiveNumberIndex = i;
                }
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] % 2 == 0 && array[i] != 0) {
                product *= array[i];
            }
        }


        return new int[]{secondPositiveNumberIndex, min, minIndex, product};
    }
}
