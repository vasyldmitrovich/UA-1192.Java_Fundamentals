package com.softserve.edu13_func.hw.hw3;

public class App {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] testYears = {1600, 1700, 1800, 1900, 2000, 2020, 2021};
        for (int year : testYears) {
            System.out.println("Year " + year + " is a leap year: " + isLeapYear(year));
        }
    }
}
