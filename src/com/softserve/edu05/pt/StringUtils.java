package com.softserve.edu05.pt;

import java.util.Scanner;

public class StringUtils {

    private static final Scanner SCAN = App.SCAN;

    public static String getString(String prompt) {
        System.out.print(prompt);
        return SCAN.nextLine();
    }

    public static String[] inputArray(int length) {
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = getString("Input " + (i + 1) + " string: ");
        }
        return arr;
    }

    public static void sortBubble(String[] arr) {// Good
        //by arr.length-1 because i and i+1 elements are compared
        for (int i = 0; i < arr.length - 1; i++) {
            //arr.length - i because each time the biggest element shuffle to the end
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean contains(String[] arr, String value) {
        for (String s : arr) {
            if (s.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
