package com.softserve.edu11.pt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PracticalTask {

    private static final Scanner SCANNER = new Scanner(System.in);

    public void task1() {

        String str1 = getPrompt("Enter string 1:");
        String str2 = getPrompt("Enter string 2: ");

        boolean result = str2.contains(str1);
        System.out.println("First variable is a substring of the second variable: " + result);
    }

    public void task2() {

        String lastName = getPrompt("Enter last name: ");
        String firstName = getPrompt("Enter first name: ");
        String middleName = getPrompt("Enter middle name: ");


        System.out.println(lastName + " " + firstName.toUpperCase().charAt(0) + "." + middleName.toUpperCase().charAt(0) + ".");
        System.out.println(firstName);
        System.out.printf("%s %s %s%n", firstName, middleName, lastName);
    }

    public void task3() {
        String regex = "^[a-zA-Z0-9_]{3,15}$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < 5; i++) {
            String username = getPrompt("Enter username: ");
            Matcher matcher = pattern.matcher(username);
            if (matcher.matches()) {
                System.out.println(username + " is valid username");
            } else {
                System.out.println(username + " is invalid username");
            }
        }
    }

    private String getPrompt(String prompt) {

        System.out.println(prompt);
        return SCANNER.nextLine();
    }
}
