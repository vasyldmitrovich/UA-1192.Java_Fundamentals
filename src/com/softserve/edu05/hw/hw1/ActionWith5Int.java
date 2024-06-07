package com.softserve.edu05.hw.hw1;

import static com.softserve.edu05.hw.hw1.App.SCANNER;

public class ActionWith5Int {

    public static void actionWith5Int() {


        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input integer number index: " + i);
            arr[i] = SCANNER.nextInt();
        }

        System.out.println("position of second positive number is: " + getPositionSecondPositivNumInArr(arr));



        System.out.println("Minimum = " + getMin(arr)+ " is in " + getIndexMin(arr) + " position");


        if (getProductEvenNum(arr) == 1) {
            System.out.print("Not entered any even numbers");
        } else {
            System.out.print("the product of all entered even numbers = " + getProductEvenNum(arr));
        }
    }

    public static int getPositionSecondPositivNumInArr(int[] arr) {


        int count = 0;
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                if (count == 2) {

                    break;
                }
            }
        }
        return i;
    }


    public static int getMin(int[] arr){
        int min = arr[0];
                int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static int getIndexMin(int[] arr){
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
        return imin;
    }

    public static int getProductEvenNum(int [] arr){
        int product = 1;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] % 2 == 0) {
                product *= arr[i];

            }
        }
        return product;
    }
}
