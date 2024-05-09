package com.softserve.edu05.hw;

import java.util.NoSuchElementException;

public class MonthDaysCalculator {

    public static int calculateMonthDays(int month) {

        int[] days = { 31, 28, 31, 30, 31, 30, 31 };

        if (month < 1 || month > 12) {
            throw new NoSuchElementException("Invalid month");
        }

        return days[month - 1];
    }

}
