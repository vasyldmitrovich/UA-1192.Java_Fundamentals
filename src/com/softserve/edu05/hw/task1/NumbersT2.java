package com.softserve.edu05.hw.task1;

//Користувач вводить 10 цілих чисел.
//Програма обчислює суму перших п'яти елементів, якщо вони позитивні,
// або добуток останніх п'яти елементів, якщо вони не позитивні, і виводить результат.

import com.softserve.utils.ScannerUtils;

public class NumbersT2 {
    public static void main(String[] args) {
        int[] integers = new int[10];
        for (int i = 0; i < 10; i++) {
            integers[i] = ScannerUtils.getValue("Input value", Integer.class);
        }
        int positiveSum = 0;
        int product = 1;
        for (int i = 0; i < integers.length; i++) {
            if (i < 5) {
                if (integers[i] > 0) {
                    positiveSum = positiveSum + integers[i];
                } else {
                    System.out.println("not all positive");
                }
            } else {
                if (integers[i] < 0) {
                    product = product * integers[i];
                } else
                    System.out.println("not all negative");
            }
        }
    }
}
