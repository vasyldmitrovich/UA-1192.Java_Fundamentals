package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    private static final Scanner scanner = new Scanner(System.in);

    public static int sumOrProd(int [] arr) {
        int sum = 0;
        int product = 1;
        boolean isPozitive = true;
        System.out.println("Your array\n" + Arrays.toString(arr));

        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                isPozitive = false;
                break;
            }
            sum += arr[i];
        }

        if (isPozitive) {
            System.out.println("The sum of first 5 value " + sum);
            return sum;
        } else {
            for (int i = arr.length - 1; i >= arr.length - 5; i--) {
                product *= arr[i];
            }
            System.out.println("The product of last 5 value " + product);
        }
        return product;
    }
    public static int [] createArr(){
        System.out.println("Enter 10 numbers");
        int []arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
