package com.softserve.edu11_str.hw.hw4;

public class Main {
    public static void main(String[] args) {
        String firstName = NameValidator.validateName("Enter your first name: ");
        String lastName = NameValidator.validateName("Enter your last name: ");

        String greeting = GreetingGenerator.generateRandomGreeting(firstName, lastName);
        System.out.println(greeting);

        NameValidator.closeScanner(); // Close the scanner to release resources
    }
}

