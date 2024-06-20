package com.softserve.edu11_str.hw.hw4;

import java.util.Random;

public class GreetingGenerator {

    private static final Random random = new Random();

    public static String generateRandomGreeting(String firstName, String lastName) {
        String[] greetings = {
                "Hello, " + firstName + " " + lastName + "!",
                "Hi there, " + firstName + "!",
                "Greetings, " + lastName + "!"
        };
        int randomIndex = random.nextInt(greetings.length);
        return greetings[randomIndex];
    }
}

