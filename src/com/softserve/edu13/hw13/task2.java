package com.softserve.edu13.hw13;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class task2 {// Name of class should be uppercase

    public static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate date = LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String date1 = "12.31.99";
        String date2 = "02.30.20";
        String date3 = "13.01.21";

        System.out.println(date1 + " is valid: " + isValidDate(date1));
        System.out.println(date2 + " is valid: " + isValidDate(date2));
        System.out.println(date3 + " is valid: " + isValidDate(date3));
    }
}
