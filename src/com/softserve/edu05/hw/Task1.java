package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1 {
    public static void task1() {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number of months (1-12): ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            int days = daysInMonth[month - 1];
            System.out.println("in month " + month + " " + days + " days");
        } else {
            System.out.println("invalid number of month.");
        }
    }
}