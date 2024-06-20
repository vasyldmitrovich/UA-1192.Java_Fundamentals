package com.softserve.edu11_str.pt.pt1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two strings
        System.out.print("Enter the first string: ");
        String substring = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String mainString = scanner.nextLine();

        // Check if substring is contained within mainString
        boolean isSubstring = mainString.contains(substring);

        // Display the result
        if (isSubstring) {
            System.out.println("\"" + substring + "\" is a substring of \"" + mainString + "\"");
        } else {
            System.out.println("\"" + substring + "\" is NOT a substring of \"" + mainString + "\"");
        }

        scanner.close();
    }
}

