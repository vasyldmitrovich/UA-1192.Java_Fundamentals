package com.softserve.edu05.hw.task1;

//Користувач вводить 10 цілих чисел.
//Програма обчислює суму перших п'яти елементів, якщо вони позитивні,
// або добуток останніх п'яти елементів, якщо вони не позитивні, і виводить результат.

import com.softserve.utils.ScannerUtils;

public class NumbersT2 {

    public static int getPositiveSum(int[] integers) {
        int positiveSum = 0;
        for (int i = 0; i < 5; i++) {
            if (integers[i] > 0) {
                positiveSum = positiveSum + integers[i];
            } else {
                throw new IllegalArgumentException("Not all numbers in the first half are positive");
            }
        }
        return positiveSum;
    }

    public static int getProductOfNegatives(int[] integers) {
        int product = 1;
        for (int i = 5; i < 10; i++) {
            if (integers[i] < 0) {
                product = product * integers[i];
            } else {
                throw new IllegalArgumentException("Not all numbers in the second half are negative");
            }
        }
        return product;
    }

    public static void main(String[] args) {
        int[] integers = new int[10];
        for (int i = 0; i < 10; i++) {
            integers[i] = ScannerUtils.getValue("Input value", Integer.class);
        }

        try {
            int positiveSum = getPositiveSum(integers);
            System.out.println("Sum of positive numbers in the first half: " + positiveSum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int product = getProductOfNegatives(integers);
            System.out.println("Product of negative numbers in the second half: " + product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}