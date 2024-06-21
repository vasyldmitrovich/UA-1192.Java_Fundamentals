package com.softserve.edu11.hw.hw3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing US currency formats ($10.99, $5.00, $1000.50): ");
        String inputText = scanner.nextLine();

        String currencyPattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(inputText);

        System.out.println("Found US currency formats:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        scanner.close();
    }
}
