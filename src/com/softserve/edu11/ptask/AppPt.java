package com.softserve.edu11.ptask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.softserve.edu01.hw.App.scanner;

public class AppPt {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {// Good
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
        System.out.print("Input the last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Input the first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Input the middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Last name and initials: " + lastName + " " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
        System.out.println("First name: " + firstName);
        System.out.println("First name, middle name and last name: " + firstName + " " + middleName + " " + lastName);
    }

    public static void task3() {
        System.out.println("Enter five usernames:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Username " + i + ": ");
            String username = scanner.nextLine();

            if (isValidName(username)) {
                System.out.println("This is valid username: " + username);
            } else {
                System.out.println("This is invalid username: " + username);
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



