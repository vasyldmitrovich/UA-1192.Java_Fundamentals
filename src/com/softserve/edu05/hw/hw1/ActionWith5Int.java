package com.softserve.edu05.hw.hw1;

import static com.softserve.edu05.hw.hw1.App.SCANNER;

public class ActionWith5Int {

    public static void actionWith5Int() {


        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input integer number index: " + i);
            arr[i] = SCANNER.nextInt();
        }


        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                if (count == 2) {
                    System.out.println("position of second positive number is: " + i);
                    break;
                }
            }
        }


        int min = arr[0];
        int imin = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin) + " position");


        int product = 1;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] % 2 == 0) {
                product *= arr[i];

            }
        }

        if (product == 1) {
            System.out.print("Not entered any even numbers");
        } else {
            System.out.print("the product of all entered even numbers = " + product);
        }
    }
}
