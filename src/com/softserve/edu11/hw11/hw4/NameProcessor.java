package com.softserve.edu11.hw11.hw4;

import java.util.Scanner;

public class NameProcessor {// Ok
    private static final String NAME_REGEX = "^[A-Za-z\\s\\-]+$";
    private Scanner scanner;

    public NameProcessor(Scanner scanner) {
        this.scanner = scanner;
    }

    public String promptForName(String prompt) {
        String name;
        do {
            System.out.print(prompt);
            name = scanner.nextLine();
        } while (!name.matches(NAME_REGEX));
        return name;
    }
}
