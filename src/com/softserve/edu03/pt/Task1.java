package com.softserve.edu03.pt;

import java.util.Scanner;

public class Task1 {
    private static Scanner scanner = new Scanner(System.in);
    private static int result;

    public static int getNumber(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static int getTotal(int a, int b) {
        result = a + b;
        return result;
    }

    public static double getAverage() {
        return (double) result / 2;
    }
}
