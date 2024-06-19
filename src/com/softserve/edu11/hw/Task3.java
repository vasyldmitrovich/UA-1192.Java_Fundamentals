package com.softserve.edu11.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String regex = "\\$\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(regex);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text containing US currency formats:");
        String inputText = scanner.nextLine();

        Matcher matcher = pattern.matcher(inputText);

        System.out.println("US currency formats found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}