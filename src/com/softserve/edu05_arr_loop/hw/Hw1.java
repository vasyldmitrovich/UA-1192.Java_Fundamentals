package com.softserve.edu05_arr_loop.hw;
import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array containing days in each month (considering leap year)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number.");
        } else {
            int days = daysInMonth[monthNumber - 1];

            // Handle February for leap years
            if (monthNumber == 2) {
                int year;
                System.out.print("Enter year (to check for leap year): ");
                year = scanner.nextInt();
                if (isLeapYear(year)) {
                    days = 29;
                }
            }

            System.out.println(monthNumber + " has " + days + " days.");
        }

        scanner.close();
    }

    // Function to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
