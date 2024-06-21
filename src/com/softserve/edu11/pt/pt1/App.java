package com.softserve.edu11.pt.pt1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        boolean isSubstring = secondString.contains(firstString);
        System.out.println("Is substring: " + isSubstring);

        scanner.close();
    }
}
