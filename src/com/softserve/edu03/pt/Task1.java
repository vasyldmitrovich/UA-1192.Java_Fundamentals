package com.softserve.edu03.pt;

import java.util.Scanner;

import static com.softserve.edu03.pt.App.SCANNER;

public class Task1 {
    public static void task1() {
        int first = getNumber("Enter the first number: ");
        int second = getNumber("Enter the second number: ");
        System.out.println("The sum of " + first + " and " + second + " is " + getTotal(first, second));
        System.out.println("The average of " + first + " and " + second + " is " + getAverage(first, second));
    }

    public static int getTotal(int first, int second) {
        return first + second;
    }

    public static float getAverage(float first, float second) {
        return (first + second) / 2;
    }

    public static int getNumber(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextInt();
    }
}