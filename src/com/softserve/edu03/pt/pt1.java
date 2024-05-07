package com.softserve.edu03.pt;

import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        int first = getNumber("Enter the first number: ");
        int second = getNumber("Enter the second number: ");
        int sum = getTotal(first, second);
        double average = getAverage(first, second);
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
        System.out.println("The average of " + first + " and " + second + " is " + average);
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getTotal(int first, int second) {
        return first + second;
    }

    public static double getAverage(int first, int second) {
        return (double) (first + second) / 2.0;
    }
}
