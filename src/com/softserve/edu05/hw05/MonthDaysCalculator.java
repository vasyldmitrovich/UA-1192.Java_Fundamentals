package com.softserve.edu05.hw05;

import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Number of days in month " + month + " is: " + daysInMonth[month - 1]);
        } else {
            System.out.println("Invalid month number!");
        }


    }
}
