package com.softserve.edu13.hw;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// This is good
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second task");

        homework3();
        System.out.println("End of the third task");

        homework4();
        System.out.println("End of the fourth task");
    }

    public static void homework1() {
        System.out.println("Enter the string");
        String line = sc.nextLine();
        System.out.println("Enter the offset");

        try {
            int offset = sc.nextInt();
            String enctyptedString = encrypt(line, offset);
            System.out.println("Your encrypted string is: " + enctyptedString);
            String decryptedString = decrypt(enctyptedString, offset);
            System.out.println("Your decrypted string is: " + decryptedString);
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("You enter wrong value");
        }
    }

    public static String encrypt (String s, int n) {
        StringBuilder encryptedString = new StringBuilder();

        for (char character : s.toCharArray()) {

            if (character != ' ') {
                int initialPosition = character - 'a';
                int newPosition = (initialPosition + n) % 26;
                char newCharacter = (char) ('a' + newPosition);
                encryptedString.append(newCharacter);
            } else {
                encryptedString.append(character);
            }

        }

        return encryptedString.toString();
    }

    public static String decrypt (String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }

    public static void homework2() {
        System.out.println("Enter the date in format mm.dd.yy");
        String date = sc.nextLine();
        String regex = "MM.dd.yy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(regex);

        try {
            LocalDate.parse(date, formatter);
            System.out.println("You entered date in right format");
        } catch (DateTimeParseException e) {
            System.out.println("You entered date in wrong format");
        }
    }

    public static void homework3() {
        System.out.println("Enter the year");

        try {
            int year = sc.nextInt();

            if (Year.isLeap(year)) {
                System.out.println("Year is leap");
            } else {
                System.out.println("Year is not leap");
            }
        } catch (InputMismatchException e) {
            System.out.println("You enter wrong value");
        }
    }

    public static void homework4() {
        LocalDate birthday = LocalDate.of(2002, 7, 29);
        checkDayOfTheWeek(birthday);
    }

    public static void checkDayOfTheWeek (LocalDate date) {
        System.out.println("The day of the week in " + date.toString() + " is/was " + date.getDayOfWeek());
        date = date.plusMonths(6);
        System.out.println("The day of the week after 6 month is/was " + date.getDayOfWeek());
        date = date.plusMonths(6);
        System.out.println("The day of the week after 12 month is/was " + date.getDayOfWeek());
    }
}
