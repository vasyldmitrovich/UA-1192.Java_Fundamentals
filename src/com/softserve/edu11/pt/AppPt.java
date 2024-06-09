package com.softserve.edu11.pt;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppPt {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("_".repeat(30) + "First task" + "_".repeat(30));
        pt1();
        System.out.println("_".repeat(30) + "Second task" + "_".repeat(30));
        pt2();
        System.out.println("_".repeat(30) + "Third task" + "_".repeat(30));
        pt3();
    }

    public static void pt1() {
        System.out.println("Input first string");
        String first = scanner.nextLine();

        System.out.println("Input second string");
        String second = scanner.nextLine();

        if (second.contains(first)) {
            System.out.println("Your second string contains first");
        } else {
            System.out.println("Your second string is not contains first");
        }
    }

    public static void pt2() {
        System.out.println("Input first name");
        String firstName = scanner.nextLine();

        System.out.println("Input last name");
        String lastName = scanner.nextLine();

        System.out.println("Input middle name");
        String middleName = scanner.nextLine();

        System.out.println("Last name and initials:\n" + lastName +
                " " + firstName.toUpperCase().charAt(0) +
                middleName.toUpperCase().charAt(0));

        System.out.println("First name:\n" + firstName);

        System.out.println("First name, middle name, and last name:\n" +
                firstName + " " + middleName + " " + lastName);
    }

    public static void pt3() {
        String patter = "\\w{3,15}";
        Pattern p = Pattern.compile(patter);

        for (int i = 0; i < 5; i++) {
            System.out.println("Input name");
            String username = scanner.nextLine();

            Matcher matcher = p.matcher(username);

            if (matcher.matches()) {
                System.out.println("Your name is valid");
            } else {
                System.out.println("Your name is invalid");
            }
        }
    }
}
