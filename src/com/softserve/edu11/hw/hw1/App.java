package com.softserve.edu11.hw.hw1;

import static com.softserve.edu01.hw.App.scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Enter a sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("Error: Please enter exactly five words.");
            scanner.close();
            return;
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        int longestWordLength = longestWord.length();
        String secondWord = words[1];
        String reversedSecondWord = new StringBuilder(secondWord).reverse().toString();

        System.out.println("The longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWordLength);
        System.out.println("The second word in reverse order: " + reversedSecondWord);

        scanner.close();
    }
}

