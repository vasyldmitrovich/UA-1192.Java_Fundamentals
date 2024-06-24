package com.softserve.edu11_str.pt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppPt {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str2.contains(str1)) {
            System.out.println(str1 + " is substring of " + str2);
        } else {
            System.out.println(str1 + " is not substring of " + str2);
        }

    }

    public static void task2() {
        System.out.println("Input first name");
        String firstName = scanner.nextLine();

        System.out.println("Input last name");
        String lastName = scanner.nextLine();

        System.out.println("Input middle name");
        String middleName = scanner.nextLine();

        System.out.println("Last name and initials:\n" + lastName +
                " " + firstName.toUpperCase().charAt(0) + "." +
                middleName.toUpperCase().charAt(0));

        System.out.println("First name:\n" + firstName);

        System.out.println("First name, middle name, and last name:\n" +
                firstName + " " + middleName + " " + lastName);

    }

    public static void task3() {
        System.out.println("Enter five usernames:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Username " + i + ": ");
            String username = scanner.nextLine();
            if (isValidName(username)) {
                System.out.println("This username matches the requirements: " + username);
            } else {
                System.out.println("This username does not match the requirements " + username);
            }
        }
    }

    public static boolean isValidName(String username) {
        String regex = "^[A-Za-z0-9_]{3,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}

