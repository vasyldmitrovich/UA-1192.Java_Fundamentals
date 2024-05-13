package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task51 {
/*
Write a Java program that performs the following tasks and outputs the results:
• Create a string array and sort it.
• Create an array with 5 elements and calculate the average value
• Сheck if the array (any of the previous ones) contains the value ( value enter from the
console). Output the result of the search.
 */

    public String[] createStringArr() {
        return new String[]{"Jack", "Bob", "Anna", "Zoe", "Philip"};
    }

    public String[] sortArr(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public double getAverage(int[] arr){
        double sum=0;

        for (int element: arr){
            sum += element;
        }
        return sum/arr.length;
    }

    public boolean contains(String value, Object[] array){
        boolean contains = false;
        for (Object element: array){
            if(element.toString().equalsIgnoreCase(value)){
                contains = true;
                break;
            }
        }
        return contains;
    }

    public void execute() {
        //Subtask 1
        System.out.println("Create a string array and sort it.");
        String[] array = createStringArr();
        System.out.println("Created array: " + Arrays.toString(array));
        System.out.println("Sorted array:" + Arrays.toString(sortArr(array)));
        System.out.println();
        //Subtask 2
        System.out.println("Create an array with 5 elements and calculate the average value");
        int[] arr2 = IntArrayGenerator.generate(5);
        System.out.println("Created array: " + Arrays.toString(arr2));
        System.out.println("Array's average value is: " + getAverage(arr2));
        System.out.println();
        //Subtask 3
        System.out.println("Check if the array contains the value");
        System.out.println("Enter the value");
        Scanner scanner = new Scanner(System.in);
        String checkedValue = scanner.nextLine();
        System.out.println(contains(checkedValue, array) ? "Given array contains " + checkedValue + " value" : checkedValue + " value is absent");

    }

}

