package com.softserve.edu13_func.hw.hw2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {

    // Method to validate the date
    public static boolean isValidDate(String date) {
        // Define the date format to be "MM.dd.y"
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy");
        dateFormat.setLenient(false); // Ensure strict date validation

        try {
            // Try to parse the date string
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            // If parsing fails, the date is invalid
            return false;
        }
    }
}

