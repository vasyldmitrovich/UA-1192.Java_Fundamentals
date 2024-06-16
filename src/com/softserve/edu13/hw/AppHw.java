package com.softserve.edu13.hw;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class AppHw {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        String originalText = "I love learning Java";
        int offset = 10;

        System.out.println("Original text: " + originalText);

        String encrypted = encrypt(originalText, offset);
        System.out.println("Encrypted text: " + encrypted);

        String decrypted = decrypt(encrypted, offset);
        System.out.println("Decrypted text: " + decrypted);
    }

    public static String encrypt(String s, int n) {
        return shiftString(s, n);
    }

    public static String decrypt(String s, int n) {
        return shiftString(s, -n);
    }

    public static String shiftString(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            result.append((char)(c + n));
        }
        return result.toString();
    }

    public static void task2() {
        System.out.print("Input date (format MM.dd.yy): ");
        String date = scan.nextLine();

        if (isValidDate(date)) {
            System.out.println(date + " is a valid date.");
        } else {
            System.out.println(date + " is not a valid date.");
        }
    }

    private static boolean isValidDate(String date) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MM.dd.yy");

        try {
            LocalDate.parse(date, pattern);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void task3() {
        System.out.print("Input year: ");
        String input = scan.nextLine();

        try {
            int year = Integer.parseInt(input);
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static void task4() {
        LocalDate birthday = LocalDate.of(2001, Month.OCTOBER, 21);

        printDayOfWeek(birthday);
        printDayOfWeek(birthday.plusMonths(6));
        printDayOfWeek(birthday.plusMonths(12));

    }

    private static void printDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Date: " + date + ". Day of the week: " + dayOfWeek);
    }
}

