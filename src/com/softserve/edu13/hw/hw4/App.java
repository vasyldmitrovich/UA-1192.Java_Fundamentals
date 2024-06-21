package com.softserve.edu13.hw.hw4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class App {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1995, 6, 4);

        DayOfWeek dayOfWeek = birthday.getDayOfWeek();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Day of the week for " + birthday.format(formatter) + ": " + dayOfWeek);

        LocalDate sixMonthsLater = birthday.plusMonths(6);
        DayOfWeek dayOfWeekAfter6Months = sixMonthsLater.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + dayOfWeekAfter6Months);

        LocalDate twelveMonthsLater = birthday.plusMonths(12);
        DayOfWeek dayOfWeekAfter12Months = twelveMonthsLater.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + dayOfWeekAfter12Months);
    }
}
