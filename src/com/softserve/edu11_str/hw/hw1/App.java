package com.softserve.edu11_str.hw.hw1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine().trim(); // Read the whole line

        // Split the sentence into words
        String[] words = sentence.split("\\s+"); // Split by whitespace

        // Initialize variables to store longest word and its length
        String longestWord = "";
        int maxLength = 0;
        // Find the longest word
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        // Print the longest word and its length
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of the longest word: " + maxLength);

        // Reverse the second word (assuming there are at least two words)
        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseString(secondWord);
            System.out.println("Second word reversed: " + reversedSecondWord);
        }

        scanner.close();
    }

    // Method to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}


