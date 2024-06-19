package com.softserve.edu11.pt;

import java.util.Scanner;

public class StringOperations {
    public String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean isSubstring(String firstString, String secondString) {
        return secondString.contains(firstString);
    }
}
