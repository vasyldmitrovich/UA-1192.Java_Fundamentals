package com.softserve.edu11.hw.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameCheck {
    private final String GAP = "-".repeat(60);
    private final String NLINE = "\n";
    private final Scanner SCANNER = new Scanner(System.in);
    String namePattern = "^[A-Z-a-z -]+$";
    Pattern pattern = Pattern.compile(namePattern);

    public String getName() {
        System.out.println(GAP + NLINE + "Enter your username, use letters, spaces or hyphens(-) :" + NLINE + GAP);
        return SCANNER.nextLine();
    }

    public String createPhrases(String name) {
        Random rnd = new Random();
        final List<String> phrases = new ArrayList<>();
        phrases.add(name + ", Welcome to community!");
        phrases.add("Welcome to the server " + name + "!");
        phrases.add("Congratulations " + name + "! You have passed the verification!");
        phrases.add(name + " congratulations!");
        phrases.add("Welcome to the party " + name + "!");
        return phrases.get(rnd.nextInt(0, 5));
    }

    public void badInput() throws InterruptedException {
        System.out.println(GAP + NLINE + "SYSTEM: BAD INPUT" + NLINE + "Name has not been verified" + NLINE + GAP);
        System.out.print("""
                Do you want to try again?
                1. Try again
                2. Exit
                """);
        int input = Integer.parseInt(SCANNER.nextLine());
        switch (input) {
            case 1 -> takeUserName();
            case 2 -> {
                System.out.println(GAP + NLINE + "Exit" + NLINE + GAP);
                System.exit(0);
            }
        }
    }

    public void takeUserName() throws InterruptedException {
        boolean check = false;
        do {
            String userName = getName();
            Matcher matcher = pattern.matcher(userName);
            if (matcher.matches()) {
                System.out.println(GAP + NLINE + "Checking the name... " + userName + NLINE + GAP);
                Thread.sleep(2000);
                System.out.println("SYSTEM: OK" + NLINE + "Name has been verified");
                System.out.println(createPhrases(userName));
                check = true;
            } else if (!matcher.matches()) {
                System.out.println(GAP + NLINE + "Checking the name... " + userName + NLINE + GAP);
                Thread.sleep(2000);
                badInput();
                break;
            }
        } while (!check);
    }

    public void run() throws InterruptedException {
        System.out.print(GAP + NLINE + """
                \t\tName check validation
                1. Input username
                2. Exit
                """ + NLINE + GAP + NLINE);
        int input = Integer.parseInt(SCANNER.nextLine());
        switch (input) {
            case 1 -> takeUserName();
            case 2 -> {
                System.out.println(GAP + NLINE + "Exit" + NLINE + GAP);
                System.exit(0);
            }
        }
    }
}
