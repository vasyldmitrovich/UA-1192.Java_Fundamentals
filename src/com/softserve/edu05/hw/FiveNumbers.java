package com.softserve.edu05.hw;

/*
5 integer numbers and find:
- position of second positive number;
- minimum value and its position in the array.
- calculate the product of all entered even numbers (exclude 0 from even if entered by
        user).

Vasyl, I had some problems with implementation finding position number in the array. Could you help me with it?
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class FiveNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        int[] arr = getRandomNumbers(5);
        System.out.println(Arrays.toString(arr));
        System.out.println("The second positive number is " + positionOfSecond(arr));
        System.out.println("The minimum value is " + findMin(arr));
        productCalculateEven(arr);


    }

    static int[] getRandomNumbers(int quantity) {
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-99, 100);
        }
        return arr;
    }

    public static int positionOfSecond(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) counter++;
            if (counter == 2) {
                counter = arr[i];
                break;
            }
        }
        return counter;
    }

    public static int findMin(int[] arr) {

        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void productCalculateEven(int[] arr) {
        int product = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i] != 0)) {
                product += arr[i];
            }
        }
        if (product > 1) {
            System.out.println("The product of all the entered even numbers = " + product);
        } else {
            System.out.println("There are no even numbers in the array.");
        }
    }}



