package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateSubstringTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateNameTask();
        System.out.println();

        System.out.println("Task 3");
        demonstrateUsernameTask();
    }

    private static void demonstrateSubstringTask() {
        System.out.print("Input first string: ");
        String firstString = SC.nextLine();
        System.out.print("Input second string: ");
        String secondString = SC.nextLine();

        if (secondString.contains(firstString)) {
            System.out.println("First string is substring of second string");
        } else {
            System.out.println("First string is not substring of second string");
        }
    }

    private static void demonstrateNameTask() {
        System.out.print("Input last name: ");
        String lastName = SC.nextLine();
        System.out.print("Input first name: ");
        String firstName = SC.nextLine();
        System.out.print("Input middle name: ");
        String middleName = SC.nextLine();

        System.out.printf("%s %c. %c.%n", lastName, firstName.toUpperCase().charAt(0),
                middleName.toUpperCase().charAt(0));
        System.out.println(firstName);
        System.out.printf("%s %s %s%n", firstName, middleName, lastName);
    }

    private static void demonstrateUsernameTask() {
        String regex = "\\w{3,15}";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < 3; i++) {
            System.out.print("Input username for validation: ");
            String username = SC.nextLine();
            Matcher matcher = pattern.matcher(username);
            if (matcher.matches()) {
                System.out.println("Username is valid");
            } else {
                System.out.println("Username is invalid");
            }
        }
    }
}
