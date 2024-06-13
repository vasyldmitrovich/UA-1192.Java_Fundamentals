package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HomeWorkTask {

    public static final Scanner SCANNER = new Scanner(System.in);

    public void task1() {

        String str = getPrompt("Enter sentence of five words: ");
        String[] words = str.split(" ");
        int lenghtMax = words[0].length();
        String longestWord = words[0];
        for (var word:words) {
            if (word.length() > lenghtMax) {
                longestWord = word;
                lenghtMax = word.length();
            }
        }
        String revers = new StringBuilder(words[1]).reverse().toString();
        System.out.println("The longest word is: " + longestWord);
        System.out.println("Number of letter of longest word is: " + lenghtMax);
        System.out.println("Revers second word is: " + revers);
    }

    public void task2() {

        String str = getPrompt("Enter sentence: ");
        String newStr = str.trim().replaceAll("\\s+", " ");
        System.out.println("Sentence without redundant spaces: " + newStr);
    }

    public void task3() {

        String str = getPrompt("Enter text with currency: ");
        Pattern format = Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher match = format.matcher(str);

        while (match.find()) {
            System.out.println(match.group());
        }
    }

    public void task4() {

        String name = getPrompt("Enter first and last name: ");
        Pattern pattern = Pattern.compile(" [a-zA-Z-]" + "[a-zA-Z-]+");
        Matcher match = pattern.matcher(name);

        while (!match.find()) {
            name = getPrompt("Incorrect input of full name it must contains only [A-Za-z-] and spaces plese enter again: ");
            match = pattern.matcher(name);
        }
        System.out.printf("Thank you" + "\t" + name + "\tfor registration!");
    }

    private String getPrompt(String prompt) {

        System.out.println(prompt);
        return SCANNER.nextLine();
    }
}