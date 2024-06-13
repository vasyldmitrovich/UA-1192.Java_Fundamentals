package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class App {

    private static final int MIN_LOWER_CHAR_ASCII = 65;
    private static final int MAX_LOWER_CHAR_ASCII = 90;
    private static final int MIN_UPPER_CHAR_ASCII = 97;
    private static final int MAX_UPPER_CHAR_ASCII = 122;
    private static final int A_Z_DISTANCE = 26;

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {// Nice
        System.out.println("Task 1");
        demonstrateSecurityTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateDateValidateTask();
        System.out.println();

        System.out.println("Task 3");
        demonstrateLeapYear();
        System.out.println();

        System.out.println("Task 4");
        demonstrateBirthdayTask();
    }

    private static void demonstrateSecurityTask() {
        try {
            System.out.print("Input message: ");
            String message = SC.nextLine();
            System.out.print("Input offset value: ");
            int offset = Integer.parseInt(SC.nextLine());
            offset %= A_Z_DISTANCE;
            String encrypted = encrypt(message, offset);
            System.out.println("Encrypted: " + encrypted);
            String decrypted = decrypt(encrypted, offset);
            System.out.println("Decrypted: " + decrypted);
        } catch (NumberFormatException e) {
            System.out.println("Wrong offset value... Aborted");
        }
    }

    private static String encrypt(String message, int offset) {
        return message.chars()
                .map(ch -> App.encryptChar(ch, offset))
                .collect(StringBuffer::new,
                        (cont, e) -> cont.append((char) e),
                        StringBuffer::append)
                .toString();
    }

    private static int encryptChar(int ch, int offset) {
        int result = ch;
        if (ch >= MIN_LOWER_CHAR_ASCII && ch <= MAX_LOWER_CHAR_ASCII) {
            result = (ch + offset);
            if (result > MAX_LOWER_CHAR_ASCII) {
                result = MIN_LOWER_CHAR_ASCII + result % MAX_LOWER_CHAR_ASCII;
            }
        } else if (ch >= MIN_UPPER_CHAR_ASCII && ch <= MAX_UPPER_CHAR_ASCII) {
            result = (ch + offset);
            if (result > MAX_UPPER_CHAR_ASCII) {
                result = MIN_UPPER_CHAR_ASCII + result % MAX_UPPER_CHAR_ASCII;
            }
        }
        return result;
    }

    private static String decrypt(String encrypted, int offset) {
        return encrypted.chars()
                .map(ch -> App.decryptChar(ch, offset))
                .collect(StringBuffer::new,
                        (cont, e) -> cont.append((char) e),
                        StringBuffer::append)
                .toString();
    }

    private static int decryptChar(int ch, int offset) {
        int result = ch;
        if (ch >= MIN_LOWER_CHAR_ASCII && ch <= MAX_LOWER_CHAR_ASCII) {
            result = (ch - offset);
            if (result < MIN_LOWER_CHAR_ASCII) {
                result = MAX_LOWER_CHAR_ASCII - MIN_LOWER_CHAR_ASCII % result;
            }
        } else if (ch >= MIN_UPPER_CHAR_ASCII && ch <= MAX_UPPER_CHAR_ASCII) {
            result = (ch - offset);
            if (result < MIN_UPPER_CHAR_ASCII) {
                result = MAX_UPPER_CHAR_ASCII - MIN_UPPER_CHAR_ASCII % result;
            }
        }
        return result;
    }


    private static void demonstrateDateValidateTask() {
        System.out.print("Input date: ");
        String date = SC.nextLine();

        if (isValid(date)) {
            System.out.println("Date format is correct");
        } else {
            System.out.println("Date format is incorrect");
        }
    }

    private static boolean isValid(String date) {
        try {
            String regex = "MM.dd.yy";
            DateTimeFormatter format = DateTimeFormatter.ofPattern(regex);
            LocalDate.parse(date, format);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    private static void demonstrateLeapYear() {
        try {
            System.out.print("Input year: ");
            int year = Integer.parseInt(SC.nextLine());

            if (Year.isLeap(year)) {
                System.out.println("Year " + year + " is leap year");
            } else {
                System.out.println("Year " + year + " isn't leap year");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong year value... Aborted");
        }
    }

    private static void demonstrateBirthdayTask() {
        LocalDate birthday = LocalDate.of(2002, 3, 6);
        printDayOfWeekAfterPeriods(birthday);
    }

    private static void printDayOfWeekAfterPeriods(LocalDate date) {
        System.out.println(date);
        System.out.println("Current day of date is " + date.getDayOfWeek());
        date = date.plusMonths(6);
        System.out.println(date);
        System.out.println("After 6 months it is " + date.getDayOfWeek());
        date = date.plusMonths(6);
        System.out.println(date);
        System.out.println("After 12 months is is " + date.getDayOfWeek());
    }
}
