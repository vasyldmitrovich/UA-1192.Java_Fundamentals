package com.softserve.edu11.hw11.hw4;

import java.util.Random;

public class GreetingGenerator {
    private static final String[] GREETINGS = {
            "Hello, %s! Nice to meet you.",
            "Hi there, %s! How are you today?",
            "Hey %s! Hope you're having a great day.",
            "Greetings, %s! Welcome to our program.",
            "Good day, %s! Ready to get started?"
    };
    private Random random;

    public GreetingGenerator() {
        this.random = new Random();
    }

    public String generateGreeting(String firstName, String lastName) {
        String greeting = GREETINGS[random.nextInt(GREETINGS.length)];
        return String.format(greeting, firstName + " " + lastName);
    }
}
