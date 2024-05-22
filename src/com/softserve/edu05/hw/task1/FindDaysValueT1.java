package com.softserve.edu05.hw.task1;

import com.softserve.utils.ScannerUtils;


public class FindDaysValueT1 {
    public static int getDaysInMonth(int monthNumber) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("Invalid month number.");
        } else {
            return daysInMonth[monthNumber - 1];
        }
    }

    public static void main(String[] args) {// Ok
        Integer monthNumber = ScannerUtils.getValue("Enter month number", Integer.class);

        try {
            System.out.println("Number of days: " + getDaysInMonth(monthNumber));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
