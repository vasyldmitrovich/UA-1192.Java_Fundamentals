package com.softserve.edu11.pt;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// Ok
        practicalTask1();
        System.out.println("End of the first practical task");

        practicalTask2();
        System.out.println("End of the second practical task");

        practicalTask3();
        System.out.println("End of the third practical task");
    }

    public static void practicalTask1 () {
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();

        if (s2.contains(s1)) {
            System.out.println("The first string is a substring of the second string");
        } else {
            System.out.println("The first string isn't a substring of the second string");
        }
    }

    public static void practicalTask2 () {
        System.out.println("Enter the last name");
        String lastName = sc.nextLine();
        System.out.println("Enter the first name");
        String firstName = sc.nextLine();
        System.out.println("Enter the middle name");
        String middleName = sc.nextLine();
        System.out.println("Last name and initials: " + lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".\n"
                + "First name: " + firstName + "\n"
                + "First name, middle name, last name: " + firstName + " " + middleName + " " + lastName);
    }

    public static void practicalTask3 () {
        int count = 0;
        Pattern pattern = Pattern.compile("\\w{3,15}");
        String [] usernames = new String[5];

        while (count != 5) {
            System.out.println("Enter the username");
            usernames [count] = sc.nextLine();
            count++;
        }

        for (String item : usernames) {
            Matcher matcher = pattern.matcher(item);
            if (matcher.matches()) {
                System.out.println("The username " + item + " is valid");
            } else {
                System.out.println("The username " + item + " is invalid");
            }
        }
    }
}
