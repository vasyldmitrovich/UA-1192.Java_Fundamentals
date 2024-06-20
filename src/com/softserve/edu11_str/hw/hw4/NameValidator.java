package com.softserve.edu11_str.hw.hw4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameValidator {

    private static final Scanner scanner = new Scanner(System.in);

    public static String validateName(String prompt) {
        String name;
        do {
            System.out.print(prompt);
            name = scanner.nextLine().trim();
        } while (!isValidName(name));
        return name;
    }

    private static boolean isValidName(String name) {
        return Pattern.matches("[A-Za-z\\s\\-]+", name);
    }

    public static void closeScanner() {
        scanner.close();
    }
}

