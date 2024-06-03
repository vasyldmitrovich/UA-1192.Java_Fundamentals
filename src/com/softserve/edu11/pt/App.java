package com.softserve.edu11.pt;

import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// And this is good
        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

        System.out.println("Demonstrate task 3");
        task3();
    }

    private static void task1() {
        System.out.println("Input first string: ");
        String firstString = sc.nextLine();

        System.out.println("Input second string: ");
        String secondString = sc.nextLine();

        System.out.println(secondString
                .contains(firstString) ? "Second string contains first string" : "Second string does not contain first string");
    }

    private static void task2() {
        System.out.println("Input last name: ");
        String lastName = sc.nextLine();

        System.out.println("Input first name: ");
        String firstName = sc.nextLine();

        System.out.println("Input middle name: ");
        String middleName = sc.nextLine();

        System.out.println("• " +
                capitalizeFirstLetter(lastName) +
                " " +
                stringToInitialFormat(firstName) +
                "." +
                stringToInitialFormat(middleName) +
                ".");

        System.out.println("• " + capitalizeFirstLetter(firstName));

        System.out.println("• " +
                capitalizeFirstLetter(firstName) +
                " " +
                capitalizeFirstLetter(middleName) +
                " " +
                capitalizeFirstLetter(lastName));
    }

    private static void task3() {
        String[] usernames = {"user1", "user_name", "us", "user123456789012345", "valid_user"};

        for (String username : usernames) {
            System.out.println("Username " + username + " is " + (isValidUsername(username) ? "" : "not ") + "valid.");
        }
    }

    private static String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    private static char stringToInitialFormat(String string) {
        return string.toUpperCase().charAt(0);
    }

    private static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z0-9_]{3,15}$");
    }
}
