package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.function.Predicate;

public class HomeWorksMeths implements Predicate {
    public static final Scanner SC = new Scanner(System.in);
    LocalDate birthday = LocalDate.of(1997, 1, 21);

    public String encrypt(String s, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (var c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + i) % 26 + base);
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public String decrypt(String s, int i) {
        return encrypt(s, 26 - i);
    }

    public String takeADate() {
        System.out.println("Input a date in format \"mm.dd.yy\":");
        return SC.nextLine();
    }

    public void dateCheck() {
        boolean check = false;
        do {
            String date = takeADate();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            try {
                LocalDate.parse(date, dateTimeFormatter);
                System.out.println("VALIDATION: OK - " + date);
                check = true;
            } catch (DateTimeParseException e) {
                System.out.println("VALIDATION ERROR - " + date);
                System.out.println("Try again, please.");
            }
        } while (!check);
    }

    public void isLeap() {
        Predicate<Integer> isLeap = s -> Year.isLeap(s);
        System.out.println("Input some year to check:");
        int input = Integer.parseInt(SC.nextLine());
        if (isLeap.test(input)) {
            System.out.println(input + " is a leap year");
        } else System.out.println(input + " isn't a leap year");
    }

    public void getDayOfWeek(LocalDate lD) {
        String day = lD.getDayOfWeek().toString();
        System.out.println("\tMy birthday was on: " + day.toUpperCase().charAt(0) + day.substring(1).toLowerCase());
        String plusSixMonth = lD.plus(6, ChronoUnit.MONTHS).getDayOfWeek().toString();
        System.out.println("\t\tAfter 6 month it was: " + plusSixMonth.toUpperCase().charAt(0) + plusSixMonth.substring(1).toLowerCase());
        String plusTwelveMonth = lD.plus(12, ChronoUnit.MONTHS).getDayOfWeek().toString();
        System.out.println("\t\t\tI celebrated my first year on the Earth on: " + plusTwelveMonth.toUpperCase().charAt(0) + plusTwelveMonth.substring(1).toLowerCase());


    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}


