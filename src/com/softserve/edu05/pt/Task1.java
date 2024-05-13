package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void task1(){
        Scanner scanner = new Scanner(System.in);


        String[] stringArray = {"banana", "apple", "orange", "grape", "pineapple"};
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));


        int[] numbers = {10, 20, 30, 40, 50};
        double average = Arrays.stream(numbers).average().orElse(Double.NaN);
        System.out.println("Average value of the array: " + average);


        System.out.print("Enter a value to search in the arrays: ");
        int searchValue = scanner.nextInt();

        boolean foundInStringArray = Arrays.asList(stringArray).contains(Integer.toString(searchValue));
        boolean foundInNumbersArray = Arrays.stream(numbers).anyMatch(num -> num == searchValue);

        System.out.println("Value " + searchValue + " found in String Array: " + foundInStringArray);
        System.out.println("Value " + searchValue + " found in Numbers Array: " + foundInNumbersArray);
    }
}
