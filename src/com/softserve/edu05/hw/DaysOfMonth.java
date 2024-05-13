package com.softserve.edu05.hw;


public class DaysOfMonth {
    private final static int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public static int getDays(int month) {
        return days[month - 1];
    }

    public static int scanMonth() {
        int month;

        System.out.println("Enter number of month");
        month = CustomScanner.scanInt();
        if (month < 1 || month > 12) {
            System.out.println("Enter correct number from 1 to 12");
            return scanMonth();
        } else {
            return month;
        }

    }
}
