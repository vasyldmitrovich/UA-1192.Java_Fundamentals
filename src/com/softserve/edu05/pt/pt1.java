package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class pt1 {// Name of class should start from Uppercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArray = {"ttt", "aaa", "rrr", "bbb", "eee"};
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

        int[] intArray = {30, 11, 32, 43, 55};
        double sum = 0;
        for (int num : intArray) {
            sum += num;
        }

        double average = sum / intArray.length;
        System.out.println("Array values: 30, 11, 32, 43, 55 \n Average value: " + average);

        System.out.print("Enter a value to search in the Int array: ");
        int searchValue = scanner.nextInt();
        boolean found = false;
        for (int num : intArray) {
            if (num == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Value found");
        } else {
            System.out.println("Value not found");
        }
    }
}
