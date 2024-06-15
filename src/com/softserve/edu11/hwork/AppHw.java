package com.softserve.edu11.hwork;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppHw {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {// Nice, this is very nice
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.print("Enter a sentence of five words: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split("\\s+");

        if (words.length == 5) {
            System.out.println("Your sentence: " + sentence);
        } else {
            System.out.println("Please enter a sentence of five words.");
        }

        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(sentence);

        String longestWord = "";

        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word: " + longestWord);
        System.out.println("The number of letters in the longest word: " + longestWord.length());

        String secondWord = words[1];

        String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();

        System.out.println("The second word in reverse order: " + reversedSecondWord);
    }

    public static void task2() {
        System.out.println("Іnput a sentence that contains words separated by more than one space: ");
        String sentence = scan.nextLine();

        String newSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("A sentence with all consecutive spaces replaced by a single space: " + newSentence);
    }

    public static void task3() {
        System.out.println("Input a text containing several instances of US currency format:");
        String text = scan.nextLine();

        String pattern = "\\$\\d+\\.\\d{2}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        System.out.println("A text containing several instances of US currency format:");
        while (m.find()) {
            System.out.println(" *" + text.substring(m.start(), m.end()) + "* ");
        }
    }

    public static void task4() {
        String pattern = "^[a-zA-Z\\s-]+$";
        Pattern p = Pattern.compile(pattern);

        String firstName = "";
        String lastName = "";

        while (true) {
            System.out.println("Input first name: ");
            firstName = scan.nextLine();
            Matcher mf = p.matcher(firstName);

            if (mf.matches()) {
                break;
            } else {
                System.out.println("Please input only English letters, spaces, and hyphens.");
            }
        }

        while (true) {
            System.out.println("Input last name: ");
            lastName = scan.nextLine();
            Matcher ml = p.matcher(lastName);

            if (ml.matches()) {
                break;
            } else {
                System.out.println("Please input only English letters, spaces, and hyphens.");
            }
        }

        String[] greetingMessage = {
                "Hello, %s! How are you?",
                "Hello, %s! Nice to see you!",
                "Welcome, %s! Hope you have a great day!",
                "Greetings, %s! How are you?",
                "Hi, %s! Welcome!",
                "Hey, %s! Glad you're here!"
        };

        Random random = new Random();
        int index = random.nextInt(greetingMessage.length);
        String greeting = greetingMessage[index];

        System.out.printf(greeting + "\n", firstName, lastName);
    }
}


