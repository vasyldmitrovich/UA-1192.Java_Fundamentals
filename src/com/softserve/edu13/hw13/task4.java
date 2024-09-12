package com.softserve.edu13.hw13;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class task4 {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.parse("1990-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

        printDaysOfWeek(birthday);
    }

    public static void printDaysOfWeek(LocalDate date) {
        System.out.println("The day of the week for the given date: " + date.getDayOfWeek());

        LocalDate dateAfter6Months = date.plus(6, ChronoUnit.MONTHS);
        System.out.println("The day of the week after 6 months: " + dateAfter6Months.getDayOfWeek());

        LocalDate dateAfter12Months = date.plus(12, ChronoUnit.MONTHS);
        System.out.println("The day of the week after 12 months: " + dateAfter12Months.getDayOfWeek());
    }
}
