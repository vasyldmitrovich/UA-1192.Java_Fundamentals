package com.softserve.edu11.hw11.hw4;

import java.util.Scanner;

public class NameValidator {
    public static void main(String[] args) {// Ok
        Scanner scanner = new Scanner(System.in);
        NameProcessor nameProcessor = new NameProcessor(scanner);
        String firstName = nameProcessor.promptForName("Enter your first name: ");
        String lastName = nameProcessor.promptForName("Enter your last name: ");
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        String greeting = greetingGenerator.generateGreeting(firstName, lastName);
        System.out.println(greeting);
    }
}
