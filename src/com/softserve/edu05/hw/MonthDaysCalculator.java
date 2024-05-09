package com.softserve.edu05.hw;

import java.util.Scanner;

public class MonthDaysCalculator {
    public static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = scanner.nextInt();

        int[] days = { 31, 28, 31, 30, 31, 30, 31 };

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        }

        System.out.println("Days in month: " + days[month - 1]);
    }
}
