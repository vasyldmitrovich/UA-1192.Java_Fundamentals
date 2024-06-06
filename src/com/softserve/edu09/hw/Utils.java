package com.softserve.edu09.hw;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Utils {
    private LinkedList<Integer> myCollection;
    private static final Scanner SCANNER = new Scanner(System.in);

    public Utils() {
    }

    public LinkedList<Integer> getMyCollection() {
        return myCollection;
    }

    public void createMyCollection() {
        myCollection = new LinkedList<>();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = getNumber("Enter number", true);
        }
        Collections.addAll(myCollection, arr);
    }

    public static int getNumber(String prompt, boolean isInt) {
        System.out.println(prompt);
        return SCANNER.nextInt();
    }
}

