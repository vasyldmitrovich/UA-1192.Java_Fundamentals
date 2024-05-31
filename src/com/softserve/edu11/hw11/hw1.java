package com.softserve.edu11.hw11;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of longest word: " + maxLength);

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseWord(secondWord);
            System.out.println("Second word in reverse order: " + reversedSecondWord);
        } else {
            System.out.println("The sentence does not contain a second word.");
        }

        scanner.close();
    }

    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
