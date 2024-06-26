package com.softserve.edu13_func.hw.hw2;

public class App {

    public static void main(String[] args) {
        // Test cases
        String[] testDates = {
                "12.31.2020",
                "02.29.2021",
                "04.31.2021",
                "13.01.2021",
                "00.10.2021",
                "01.10.2021"
        };

        // Validate each test date
        for (String date : testDates) {
            boolean isValid = DateValidator.isValidDate(date);
            System.out.println(date + " is valid: " + isValid);
        }
    }
}

