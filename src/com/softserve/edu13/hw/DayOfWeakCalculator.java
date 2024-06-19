package com.softserve.edu13.hw;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class DayOfWeekCalculator {

    public void printDayOfWeekDetails(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String formattedDate = date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println("Day of the week for date " + formattedDate + ": " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        LocalDate sixMonthsLater = date.plusMonths(6);
        DayOfWeek dayOfWeekAfterSixMonths = sixMonthsLater.getDayOfWeek();
        String formattedSixMonthsLater = sixMonthsLater.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println("Day of the week after 6 months (" + formattedSixMonthsLater + "): " + dayOfWeekAfterSixMonths.getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        LocalDate twelveMonthsLater = date.plusMonths(12);
        DayOfWeek dayOfWeekAfterTwelveMonths = twelveMonthsLater.getDayOfWeek();
        String formattedTwelveMonthsLater = twelveMonthsLater.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println("Day of the week after 12 months (" + formattedTwelveMonthsLater + "): " + dayOfWeekAfterTwelveMonths.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
