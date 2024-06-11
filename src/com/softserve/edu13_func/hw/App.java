package com.softserve.edu13_func.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

import static com.softserve.edu13_func.hw.App.DateValidator.isValidDate;

public class App {


    public static void main(String[] args) {


//        task1();
//        task2();
//        task3();
        task4();


    }

    public static void task1() {

        String original = "Softserve!";
        int shift = 3;


        String encrypted = encrypt(original, shift);
        System.out.println("Encrypt string: " + encrypted);


        String decrypted = decrypt(encrypted, shift);
        System.out.println("decrypt string: " + decrypted);

    }


    public static void task2() {
        String date1 = "11.06.24";
        String date2 = "40.06.2a4";

        System.out.println(date1 + " is valid: " + isValidDate(date1));
        System.out.println(date2 + " is valid: " + isValidDate(date2));
    }

    public static void task3() {

        int year1 = 2024;
        int year2 = 2025;

        System.out.println(year1 + " is leap year: " + isLeapYear(year1));
        System.out.println(year2 + " is leap year: " + isLeapYear(year2));

    }


    public static void task4() {

        LocalDate birthday = LocalDate.of(1983, 5, 3);

        printDayOfWeekInfo(birthday);

    }


    public static String encrypt(String s, int n) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + n) % 26 + base);
            }
            encrypted.append(c);
        }
        return encrypted.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - n % 26);
    }


    public class DateValidator {

        public static boolean isValidDate(String dateStr) {

            SimpleDateFormat format = new SimpleDateFormat("MM.dd.yy");
            format.setLenient(false);

            try {

                Date date = format.parse(dateStr);
                return true;

            } catch (ParseException e) {
                return false;
            }
        }


    }

    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printDayOfWeekInfo(LocalDate date) {

        DayOfWeek currentDayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week: " + currentDayOfWeek);


        LocalDate dateAfter6Months = date.plusMonths(6);
        LocalDate dateAfter12Months = date.plusMonths(12);

        DayOfWeek dayOfWeekAfter6Months = dateAfter6Months.getDayOfWeek();
        DayOfWeek dayOfWeekAfter12Months = dateAfter12Months.getDayOfWeek();

        System.out.println("Day of the week after 6 months: " + dayOfWeekAfter6Months);
        System.out.println("Day of the week after 12 months: " + dayOfWeekAfter12Months);
    }
}