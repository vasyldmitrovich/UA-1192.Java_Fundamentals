package com.softserve.edu11.pt.pt3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = new String[5];

        System.out.println("Please enter 5 usernames to validate:");

        for (int i = 0; i < usernames.length; i++) {
            System.out.print("Enter username " + (i + 1) + ": ");
            usernames[i] = scanner.nextLine();
        }

        System.out.println("\nValidation results:");
        for (String username : usernames) {
            boolean isValid = UsernameValidator.isValidUsername(username);
            System.out.println("Username \"" + username + "\" is " + (isValid ? "valid" : "invalid"));
        }

        scanner.close();
    }
}