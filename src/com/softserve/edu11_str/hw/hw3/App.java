package com.softserve.edu11_str.hw.hw3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the regular expression pattern for US currency format
        String regex = "\\$\\d+(\\.\\d{2})";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Input the text containing currency formats
        System.out.println("Enter text containing US currency format (e.g., $123.45):");
        String inputText = scanner.nextLine();

        // Create matcher object
        Matcher matcher = pattern.matcher(inputText);

        // Find and display all occurrences of US currency format
        System.out.println("US currency formats found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}

