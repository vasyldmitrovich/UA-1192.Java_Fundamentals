package com.softserve.edu05.hw;

import java.util.NoSuchElementException;

public class Months {
    public static int getNumberOfDays(int monthNumber) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysInMonth;

        if (monthNumber >= 1 && monthNumber <= 12) {
            daysInMonth = monthDays[monthNumber - 1];

        } else {
            throw new NoSuchElementException("There isn`t such a month");
        }
        return daysInMonth;

    }
}