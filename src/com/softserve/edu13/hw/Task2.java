package com.softserve.edu13.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task2 {

    public static void main(String[] args) {// Good
        String date1 = "12.31.21";
        String date2 = "02.29.20";
        String date3 = "13.01.22";
        String date4 = "02.30.22";

        System.out.println(date1 + " is valid: " + isValidDate(date1));
        System.out.println(date2 + " is valid: " + isValidDate(date2));
        System.out.println(date3 + " is valid: " + isValidDate(date3));
        System.out.println(date4 + " is valid: " + isValidDate(date4));
    }

    public static boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false);

        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
