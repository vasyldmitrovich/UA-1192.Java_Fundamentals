package com.softserve.edu13.hw.hw2;

import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) {
        String date1 = "12.31.24"; // Valid date
        String date2 = "13.01.24"; // Invalid month (13)
        String date3 = "12-31-24"; // Invalid format

        System.out.println(date1 + " valid: " + isValidDate(date1));
        System.out.println(date2 + " valid: " + isValidDate(date2));
        System.out.println(date3 + " valid: " + isValidDate(date3));
    }

    public static boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yy");
        sdf.setLenient(false);

        try {
            sdf.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
