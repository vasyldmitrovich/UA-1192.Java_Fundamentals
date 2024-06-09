package com.softserve.edu11.hw;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("=".repeat(20) + "Task 1" + "=".repeat(20));
        task1();
        System.out.println("=".repeat(20) + "Task 2" + "=".repeat(20));
        task2();
        System.out.println("=".repeat(20) + "Task 3" + "=".repeat(20));
        task3();
        System.out.println("=".repeat(20) + "Task 4" + "=".repeat(20));
        task4();
    }

    public static void task1() {
        String sentence = getString("Input a sentence of five words");
        String[] wordsOfSentence = sentence.split(" ");
        String theLongestWord = " ";
        for (String word : wordsOfSentence) {
            if (word.length() > theLongestWord.length()) {
                theLongestWord = word;
            }
        }
        System.out.println("The longest word is " + theLongestWord + " with length " + theLongestWord.length());
        String secondWord = wordsOfSentence[1];
        StringBuilder stringBuilder = new StringBuilder(secondWord);
        String reversedSecondWord = String.valueOf(stringBuilder.reverse());
        System.out.println("Second word in reversed order: " + reversedSecondWord);


    }

    public static void task2() {
        String sentence = getString("Enter the sentence separated by two or more spaces: ");
        System.out.println(sentence.replaceAll(" +", " "));
    }

    public static void task3() {
        String inputText = getString("Enter the text containing several instances of US currency formats: ");
        String currencyPattern = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("Right US currency formats in input text: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void task4() {
        String firstName;
        String lastName;
        Random rnd = new Random();
        Pattern pattern = Pattern.compile("^[A-Za-z\\s\\-]+$");
        String[] greetingMessages = {
                "Hi, %s! Nice to meet you!",
                "Hello, %s, how are you?",
                "Good morning, %s! How was your sleep?"
        };

        while (true) {
            firstName = getString("Enter your firstname: ");
            Matcher matcher = pattern.matcher(firstName);
            if (!matcher.matches()) {
                System.out.println("Incorrect firstname, please  retry.");
            } else {
                break;
            }
        }
        while (true) {
            lastName = getString("Enter your lastname: ");
            Matcher matcher = pattern.matcher(lastName);
            if (!matcher.matches()) {
                System.out.println("Incorrect lastname, please  retry.");
            } else {
                break;
            }
        }

        int randomGreetingIndex = rnd.nextInt(greetingMessages.length);
        String randomGreeting = greetingMessages[randomGreetingIndex];
        System.out.printf(randomGreeting, firstName);
    }

    public static String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }
}
