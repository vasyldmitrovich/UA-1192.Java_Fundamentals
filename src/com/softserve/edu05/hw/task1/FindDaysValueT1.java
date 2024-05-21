package com.softserve.edu05.hw.task1;

import com.softserve.utils.ScannerUtils;


public class FindDaysValueT1 {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Integer monthNumber = ScannerUtils.getValue("Enter month number", Integer.class);

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number.");
        } else {
            System.out.println("Number of days: " + daysInMonth[monthNumber - 1]);
        }
    }
}
