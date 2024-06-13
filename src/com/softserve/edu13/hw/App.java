package com.softserve.edu13.hw;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;

public class App {
    private static final String DATE_PATTERN = "^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.\\d{2}$";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM.dd.yy");

    public static void main(String[] args) {// Ok
        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

        System.out.println("Demonstrate task 3");
        task3();

        System.out.println("Demonstrate task 4");
        task4();
    }

    public static void task1() {
        int offset = 10;

        String encrypted = encrypt("Hello world", offset);
        String decrypted = decrypt(encrypted, offset);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    public static void task2() {
        String date1 = "12.31.99";
        String date2 = "02-30-20";
        String date3 = "13.01.21";
        String date4 = "04.31.22";
        String date5 = "06.15.23";

        System.out.println(date1 + " is valid: " + isValidDate(date1));
        System.out.println(date2 + " is valid: " + isValidDate(date2));
        System.out.println(date3 + " is valid: " + isValidDate(date3));
        System.out.println(date4 + " is valid: " + isValidDate(date4));
        System.out.println(date5 + " is valid: " + isValidDate(date5));
    }

    public static void task3() {
        int year = 2024;

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);

        boolean isLeap = cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;

        System.out.println("Given year: " + year + " isLeap: " + isLeap);
    }

    public static void task4() {
        LocalDate birthday = LocalDate.of(2000, Month.MAY, 8);

        printDaysOfWeek(birthday);
    }

    public static void printDaysOfWeek(LocalDate date) {

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week on the given date: " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        LocalDate dateAfter6Months = date.plusMonths(6);
        DayOfWeek dayOfWeekAfter6Months = dateAfter6Months.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + dayOfWeekAfter6Months.getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        LocalDate dateAfter12Months = date.plusMonths(12);
        DayOfWeek dayOfWeekAfter12Months = dateAfter12Months.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + dayOfWeekAfter12Months.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }

    public static boolean isValidDate(String dateStr) {

        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(dateStr);

        if (!matcher.matches()) {
            return false;
        }

        try {
            LocalDate.parse(dateStr, DATE_FORMATTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static String encrypt(String s, int n) {
        return rebuildString(s, n);
    }

    public static String decrypt(String s, int n) {
        return rebuildString(s, -n);
    }

    public static String rebuildString(String s, int n) {

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            sb.append((char)(c + n));
        }

        return sb.toString();
    }
}
