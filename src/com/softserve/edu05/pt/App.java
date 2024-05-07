package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        String[] strArray = {"pineapple", "apple", "banana", "orange"};

        Arrays.sort(strArray);
        System.out.println("Sorted string array: " + Arrays.toString(strArray));

        int[] intArray = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int d : intArray) {
            sum += d;
        }
        ;

        double average = (double) sum / intArray.length;
        System.out.println("Average of array: " + average);

        System.out.println("Input value to search in fruits array: ");
        String searchValue = scanner.nextLine();

        System.out.println(Arrays.asList(strArray).contains(searchValue) ?
                "The array contains the entered value" : "The array does not contain the entered value");

    }

    private static void task2() {
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }

    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {

            if ((number % i) == 0) {
                return false;
            }

        }

        return true;
    }

}
