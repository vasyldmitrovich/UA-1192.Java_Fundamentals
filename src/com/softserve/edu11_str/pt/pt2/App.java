package com.softserve.edu11_str.pt.pt2;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input last name, first name, and middle name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine().trim();

        // Output formats
        System.out.println("Last name and initials: " + lastName + " " + getInitials(firstName, middleName));
        System.out.println("First name: " + firstName);
        System.out.println("First name, middle name, and last name: " + firstName + " " + middleName + " " + lastName);

        scanner.close();
    }

    // Method to get initials from first name and middle name
    private static String getInitials(String firstName, String middleName) {
        StringBuilder initials = new StringBuilder();
        initials.append(firstName.charAt(0)).append(".");
        if (!middleName.isEmpty()) {
            initials.append(middleName.charAt(0)).append(".");
        }
        return initials.toString();
    }
}

