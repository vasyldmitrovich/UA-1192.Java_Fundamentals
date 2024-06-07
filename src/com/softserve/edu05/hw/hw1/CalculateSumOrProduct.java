package com.softserve.edu05.hw.hw1;

import java.util.Arrays;

import static com.softserve.edu05.hw.hw1.App.SCANNER;

public class CalculateSumOrProduct {

    public static void sumOrProduct() {


        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input integer number index: " + i);
            arr[i] = SCANNER.nextInt();
        }

        int sum = 0;
        int product = 1;


        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                sum += arr[i];

            } else {
                sum = 0;
                break;
            }
        }

        if (sum == 0) {

            for (int i = 5; i < 10; i++) {
                product *= arr[i];
            }

            System.out.println("Product:" + product);

        } else {
            System.out.println("Sum:" + sum);
        }
    }


}
