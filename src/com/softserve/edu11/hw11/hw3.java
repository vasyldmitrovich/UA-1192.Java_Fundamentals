package com.softserve.edu11.hw11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {// Good
        String pattern = "\\$\\d+\\.\\d{2}";
        Pattern regex = Pattern.compile(pattern);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text containing US currency format:");
        String text = scanner.nextLine();
        scanner.close();

        Matcher matcher = regex.matcher(text);
        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
