package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Task4 {

    public static void main(String[] args) {
        // Set your birthday
        LocalDate birthday = LocalDate.of(2000, 8, 15); // Replace with your actual birthday

        // Create an instance of the subclass and call its method
        DayOfWeekCalculator calculator = new DayOfWeekCalculator();
        calculator.printDayOfWeekDetails(birthday);
    }
}
