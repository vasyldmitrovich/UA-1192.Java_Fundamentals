package com.softserve.academy.edu05.hw.task_1;

import java.util.Scanner;

public class CalculatesNumberOfDays {

    /**
     * Create a program (in different java documents) that prompts the user to enter:
     * • a month number and calculates the number of days in that month based on an array
     * that contains the number of days in each month.
     */
    public static int execute() {// Nice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number: ");
        int month = scanner.nextInt();
        while (month < 1 || month > 12) {
            System.out.println("Invalid month number. Please enter a valid month number: ");
            month = scanner.nextInt();
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int numberOfDays = daysInMonth[month - 1];

        System.out.println("Number of days in month " + month + " is: " + numberOfDays);

        scanner.close();




        return numberOfDays;
    }
}
