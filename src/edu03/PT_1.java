package edu03;

import java.util.Scanner;

public class PT_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = getNumber("input first number: ");
        int second = getNumber("input second number: ");

        int sum = (int) getTotal(first, second);
        double average = getAverage(first, second);

        System.out.println("The sum of " +first + " and "+second +" is "+sum);
        System.out.println("The average of " +first + " and " +second + " is " +average);
    }

    private static int getNumber(String promt) {
        System.out.println(promt);
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }

    private static int getTotal(int first, int second) {
        return first + second;
    }

    private static double getAverage(int first, int second) {
        double tot = first + second;
        return tot / 2;

    }
}