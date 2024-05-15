package com.softserve.edu05.hw;

import java.util.Scanner;

public class hw1 {// Name of class should start from Uppercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] monthDays = {
                {"Jan", "Feb", "Mar",
                        "Apr", "May", "Jun",
                        "Jul", "Aug", "Sep",
                        "Oct", "Nov", "Dec"},

                {"31", "28", "31",
                        "30", "31", "30",
                        "31", "31", "30",
                        "31", "30", "31"}
        };

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = monthDays[0][monthNumber - 1];
            String days = monthDays[1][monthNumber - 1];

            System.out.println("Month: " + monthName);
            System.out.println("Number of days: " + days);
        } else {
            System.out.println("Invalid month number");
        }
    }
}
