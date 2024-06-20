package com.softserve.edu11.hw;

public class SentenceProcessor {
    public void findAndPrintLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = findLongestWord(words);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of the longest word: " + longestWord.length());
    }

    public void printSecondWordReversed(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseString(secondWord);
            System.out.println("Second word reversed: " + reversedSecondWord);
        } else {
            System.out.println("Sentence does not contain enough words to reverse the second word.");
        }
    }

    private String findLongestWord(String[] words) {// Good
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    private String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
