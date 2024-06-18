package com.softserve.edu13.hw;


import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AppHw {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {// Nice
        System.out.println("-".repeat(20) + "Homework 1" + "-".repeat(20));
        hw1();
        System.out.println("-".repeat(20) + "Homework 2" + "-".repeat(20));
        hw2();
        System.out.println("-".repeat(20) + "Homework 3" + "-".repeat(20));
        hw3();
        System.out.println("-".repeat(20) + "Homework 4" + "-".repeat(20));
        hw4();
    }

    private static void hw1() {
        String msg = "I - love J@va";
        int number = 3;
        String encryptedMsg = encrypt(msg, number);
        System.out.println("Encrypted text: " + encryptedMsg);

        String decryptedMsg = decrypt(encryptedMsg, number);
        System.out.println("DecryptedMsg text: " + decryptedMsg);
    }

    private static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char) ((c - base + n) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    private static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }

    private static void hw2() {
        System.out.println("Enter a date like MM.dd.yy");
        String dateStr = scanner.nextLine();
        if (isValidDate(dateStr)) {
            System.out.println("You entered valid date");
        } else {
            System.out.println("You entered not valid date");

        }
    }

    private static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private static void hw3() {
        int year = readYear("Enter the year");
        if (isLeapYear(year)) {
            System.out.printf("This %d year is a leap year\n", year);
        } else {
            System.out.printf("This %d year is not a leap year\n", year);
        }

    }

    private static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    private static int readYear(String prompt) {
        while (true) {
            try {
                int year = readInt(prompt);
                if (year <= 0) {
                    throw new IllegalArgumentException();
                }
                return year;
            } catch (IllegalArgumentException e) {
                System.err.println("The year cannot be a negative value!!!");
            }
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.err.println("You must enter a integer value!");
            }
        }
    }

    private static void hw4() {
        LocalDate birthday = LocalDate.of(2004, Month.FEBRUARY, 18);
        System.out.println("My birthday:"+birthday);
        dayOf(birthday);
    }

    private static void dayOf(LocalDate localDate) {
        System.out.println("Your birthday was in " + localDate.getDayOfWeek());
        LocalDate dayAfter6Month = localDate.plusMonths(6);
        System.out.println("Day after 6 month was " + dayAfter6Month.getDayOfWeek());
        LocalDate dayAfter12Month = localDate.plusMonths(12);
        System.out.println("Day after 12 month was " + dayAfter12Month.getDayOfWeek());

    }

}
