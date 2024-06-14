package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Task133 {
/*
Create method which take year as a parameter and return true if year is a leap
 */

    public static boolean isLeap(int yeer){
        LocalDate date = LocalDate.of(yeer,1,1);
        return date.isLeapYear();
    }
}
