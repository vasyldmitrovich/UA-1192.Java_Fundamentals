package com.softserve.edu13.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// Good
        System.out.println("=".repeat(20) + "Task 1" + "=".repeat(20));
        task1();
        System.out.println("=".repeat(20) + "Task 2" + "=".repeat(20));
        task2();
        System.out.println("=".repeat(20) + "Task 3" + "=".repeat(20));
        task3();
        System.out.println("=".repeat(20) + "Task 4" + "=".repeat(20));
        task4();
    }

    public static void task1() {
        String text = "I am 19 y.o.";
        String encrypted = encrypt(text, 3);
        System.out.println("Encrypted input text: " + encrypted);
        String decrypted = decrypt(encrypted, 3);
        System.out.println("Decrypted text: " + decrypted);
    }

    public static void task2() {
        String[] dates = {
                "05.12.04",
                "15.05.07",
                "21.21.01",
                "02.21.99"
        };
        for (String date : dates) {
            System.out.println("The date " + date + " valid?: " + isValidDate(date));
        }

    }

    public static void task3() {
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (isLeap(year)) {
            System.out.println("The year " + year + " is leap.");
        } else {
            System.out.println("The year " + year + " is not leap.");
        }
    }
    public static void task4() {
        System.out.println("Enter the year of your birth: ");
        int year = sc.nextInt();
        System.out.println("Enter the month of your birth: ");
        int month = sc.nextInt();
        System.out.println("Enter the day of your birth: ");
        int day = sc.nextInt();
        LocalDate bDay = LocalDate.of(year, month, day);
        dayOfWeek(bDay);
    }

    public static String encrypt(String s, int n) {
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

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n);
    }

    public static boolean isValidDate(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM.dd.yy");
        simpleDateFormat.setLenient(false);
        try {
            simpleDateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isLeap(int year) {
        return Year.isLeap(year);
    }

    public static void dayOfWeek(LocalDate localDate) {
        DayOfWeek bDayDate = localDate.getDayOfWeek();
        System.out.println("It was " + bDayDate + " when you were born!");
        DayOfWeek dayIn6Months = localDate.plusMonths(6).getDayOfWeek();
        System.out.println("It was " + dayIn6Months + " in 6 months after you were born.");
        DayOfWeek dayIn12Months = localDate.plusMonths(12).getDayOfWeek();
        System.out.println("It was " + dayIn12Months + " in 12 months after you were born.");
    }

}
