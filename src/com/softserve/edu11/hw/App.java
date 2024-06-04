package com.softserve.edu11.hw;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    private static final String NAME_PATTERN = "^[a-zA-Z\\s-]+$";

    private static final String[] GREETINGS = {
            "Hello, %s! Welcome to our service.",
            "Hi, %s! Nice to see you.",
            "Greetings, %s! Hope you're having a great day.",
            "Hey, %s! How can we assist you today?",
            "Good day, %s! What can we do for you?"
    };

    public static void main(String[] args) {// Nice to see this code, nice
        System.out.println("Demonstrate task 1");
        task1(args);

        System.out.println("Demonstrate task 2");
        task2();

        System.out.println("Demonstrate task 3");
        task3();

        System.out.println("Demonstrate task 4");
        task4();
    }

    private static void task1(String[] sentence) {
        if (sentence.length == 0) {
            System.out.println("No sentence.");
            return;
        }

        String longestWord = sentence[0];
        for (String word : sentence) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Longest letters quantity: " + longestWord.length());

        if (sentence.length == 1) {
            System.out.println("Sentence contains one word.");
        } else {
            System.out.println("Second word in reverse order: " + reverseString(sentence[1]));
        }
    }

    private static void task2() {
        System.out.println("Input sentence");
        String sentence = sc.nextLine();

        System.out.println(sentence.trim().replaceAll(" +", " "));
    }

    public static void task3() {
        System.out.println("Input text");
        String text = sc.nextLine();

        List<String> allMatches = new ArrayList<>();

        Matcher m = Pattern.compile("\\d+\\.\\d{2}\\$")
                .matcher(text);

        System.out.println("Founded matches");
        while (m.find()) {
            allMatches.add(m.group());
        }

        System.out.println(allMatches);

    }

    public static void task4() {
        String firstName;
        String lastName;

        while (true) {
            System.out.print("Enter your first name: ");
            firstName = sc.nextLine();

            if (isValidName(firstName)) {
                break;
            } else {
                System.out.println("Invalid first name. Please use only English letters, spaces, and hyphens.");
            }
        }

        while (true) {
            System.out.print("Enter your last name: ");
            lastName = sc.nextLine();

            if (isValidName(lastName)) {
                break;
            } else {
                System.out.println("Invalid last name. Please use only English letters, spaces, and hyphens.");
            }
        }

        String greeting = generateRandomGreeting(firstName + " " + lastName);
        System.out.println(greeting);
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    private static boolean isValidName(String name) {
        return Pattern.matches(NAME_PATTERN, name);
    }

    private static String generateRandomGreeting(String fullName) {
        Random random = new Random();
        int index = random.nextInt(GREETINGS.length);
        return String.format(GREETINGS[index], fullName);
    }
}
