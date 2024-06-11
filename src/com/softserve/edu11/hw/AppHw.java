package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.softserve.edu01.hw.App.scanner;

public class AppHw {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {

        System.out.println("Enter a sentence with five words: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;

                System.out.println("Longest word in the sentence: " + longestWord);
                if (words.length >= 2) {
                    String secondWord = words[1];
                    String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();
                    System.out.println("Second word in reverse order: " + reversedSecondWord);
                } else {
                    System.out.println("The sentence does not contain a second word.");
                }
            }
        }
    }

    public static void task2() {
        System.out.println("Enter a sentence with words separated by more than one space:");
        String sentence = scan.nextLine();
        String cleanedSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("Result: " + cleanedSentence);
    }

    public static void task3() {


        String pattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern1 = Pattern.compile(pattern);

        System.out.println("Enter text containing US currency format:");
        String text = scanner.nextLine();

        Matcher matcher = pattern1.matcher(text);
        // Пошук та відображення всіх випадків формату валюти США
        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}






