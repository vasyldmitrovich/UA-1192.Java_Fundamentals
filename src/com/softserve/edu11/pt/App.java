package com.softserve.edu11.pt;

import java.util.Scanner;

import static com.softserve.edu01.hw.App.scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);// Here was mistake, field should have name scanner not scan

    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    public static void task1() {


        System.out.println("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String string2 = scanner.nextLine();


        if (string2.contains(string1)) {
            System.out.println(string1 + " is substring of " + string2);
        } else {
            System.out.println(string1 + " is not substring of " + string2);
        }
    }

    public static void task2() {
        System.out.println("Enter the last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter the First name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter the Middle name:");
        String middleName = scanner.nextLine();

        System.out.println("Last name and initials: " + lastName + " " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
        System.out.println("First name:" + firstName);
        System.out.println("First name,middle name and last name:" + "" + firstName + " " + middleName + " " + lastName);

    }

    public static void task3() {
        System.out.println("Enter five usernames:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter username:" + (i+1) + ":");
            String username = scanner.nextLine();
            if (username.matches("[a-zA-Z0-9_]{3,15}")) {
                System.out.println("Username '" + username + "' is valid.");
            } else {
                System.out.println("Username '" + username + "' is not valid.");
            }
        }
    }
}