package com.softserve.edu11.pt;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) {
        System.out.println("=".repeat(20) + "Task 1" +  "=".repeat(20));
        task1();
        System.out.println("=".repeat(20) + "Task 2" +  "=".repeat(20));
        task2();
        System.out.println("=".repeat(20) + "Task 3" +  "=".repeat(20));
        task3();
    }

    public static void task1() {
        String s1 = getString("Enter the first string: ");
        String s2 = getString("Enter the second string: ");
        boolean contains = s2.contains(s1);
        if (contains) {
            System.out.println("Second string contains first string!");
        } else {
            System.out.println("Second string does not contains first string");
        }
    }

    public static void task2() {
        String lastname = getString("Enter the lastname: ");
        String firstname = getString("Enter the firstname: ");
        String middlename = getString("Enter the middle name: ");
        String initials = (firstname.charAt(0) + "." + middlename.charAt(0) + ".").toUpperCase();
        System.out.println("Lastname and initials: " + lastname + " " + initials);
        System.out.println("Firstname: " + firstname);
        System.out.println("Firstname, middle name, lastname: " + firstname + " " + middlename + " " + lastname);
    }

    public static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public static void task3() {
        String[] usernames = {"User-1", "user_2", "12334", "useruser--", "User_2018"};
        for (String username : usernames) {
            if (matchesUsername(username)) {
                System.out.println("Username " + username + " is valid.");
            } else {
                System.out.println("Username " + username + " is not valid.");
            }
        }

    }

    public static boolean matchesUsername(String username) {
        String pattern = "^[a-zA-Z0-9_]{3,15}$";
        return username.matches(pattern);
    }
}
