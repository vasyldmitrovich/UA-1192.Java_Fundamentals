package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1_2 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void hwDoTask2() {
        int[] arr = new int[10];
        int multiply1 = 0;
        boolean res = false;
        boolean multiply = false;
        System.out.println("Введіть 10 довільних чисел. " +
                "Якщо перші 5 чисел додатні - виконається їхнє додавання." +
                "\nЯкщо останні 5 чисел від'ємні - виконається добуток цих чисел: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Hw1_1.getNumber();
        }
        for (int i = 0; i <= 4; i++) {
            if (arr[i] >= 0) {
                multiply1 += arr[i];
                res = true;
            } else if (arr[i] < 0) {
                multiply1 = 0;
                res = false;
                break;
            }
        }
        for (int i = 9; i > 5; i--) {
            if (arr[i] < 0) {
                multiply = true;
            } else if (arr[i] >= 0) {
                multiply = false;
                break;
            }
        }
        if (multiply) {
            multiply1 = arr[5] * arr[6] * arr[7] * arr[8] * arr[9];
            System.out.printf("Результат добутку останніх 5-ти елементів = %d\n", multiply1);
        } else if (res) {
            System.out.printf("Результат додавання перших 5-ти елементів = %d\n", multiply1);
        } else System.out.println("Умова завдання не виконана\n" + Arrays.toString(arr));
    }
}
