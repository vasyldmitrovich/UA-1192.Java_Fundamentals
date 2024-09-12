package com.softserve.edu11.pt11;

import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Last name and initials: " + lastName + " " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
        System.out.println("First name: " + firstName);
        System.out.println("First name, middle name, and last name: " + firstName + " " + middleName + " " + lastName);

        scanner.close();
    }
}
