package com.softserve.edu03.pt;

import java.util.Scanner;

public class Calculation {// All good
    public static void main(String[] args) {

        int num1 = getNumber("Enter the first number:");
        int num2 = getNumber("Enter the second number:");
        int total = getTotal(num1, num2);
        double average = getAverage(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + total);
        System.out.println("Average of " + num1 + " and " + num2 + " is " + average);
    }

    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static double getAverage(int num1, int num2) {
        return (double) getTotal(num1, num2) / 2;
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}