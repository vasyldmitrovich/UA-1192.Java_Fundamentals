package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        String[] strArray = {"pineapple", "apple", "banana", "orange"};

        Arrays.sort(strArray);
        System.out.println("Sorted string array: " + Arrays.toString(strArray));

        int[] intArray = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int d : intArray) {
            sum += d;
        };

        double average = (double) sum / intArray.length;
        System.out.println("Average of array: " + average);

        System.out.println("Input value to search in fruits array: ");
        String searchValue = scanner.nextLine();

        System.out.println(Arrays.asList(strArray).contains(searchValue) ?
                "The array contains the entered value" : "The array does not contain the entered value");

    }

}
