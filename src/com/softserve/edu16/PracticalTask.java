package com.softserve.edu16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class PracticalTask {// Good
    private static BufferedReader BUFFERED_READER = null;

    public void task1() {

        String fileName = "mytext.txt";
        List<String> arrayOfLines = new ArrayList<>();

//        Copy from file to List
        fileToList(fileName, arrayOfLines);

//        count and write the number of symbols in every line.
        List<Integer> lenghtOfLines = arrayOfLines.stream()
                .map(String::length)
                .collect(Collectors.toList());

//        find the longest and the shortest line.
        IntSummaryStatistics stats = lenghtOfLines.stream()
                .mapToInt((x) -> x).summaryStatistics();
        int min = stats.getMin();
        int max = stats.getMax();

//        find and write only that lines, which consist of word «var»
        List<String> varLines = arrayOfLines.stream()
                .filter(element -> element.contains("var"))
                .collect(Collectors.toList());

        System.out.println("\nList of lines: \n" + arrayOfLines);
        System.out.println("\nList of lenght of lines: \n" + lenghtOfLines);
        System.out.println("\nMin is: " + min + "\nMax is: " + max);
        System.out.println("\nList of lines with var: \n" + varLines);
    }

    public void task2() {

        String fileName = "text.txt";
        List<String> arrayOfLines = new ArrayList<>();
        fileToList(fileName, arrayOfLines);

//        find and output to the console all words starting with a vowel
        System.out.println("\nWords starting with a vowel");
        arrayOfLines.stream()
                .flatMap(l -> Arrays.stream(l.split("\\s+")))
                .map(word -> word.toLowerCase())
                .filter(word -> word.matches("[aeiou]\\w*"))
                .forEach(System.out::println);

//        find and output to the console all words for which the last letter of one word
//        matches the first letter of the next word.
        List<String> words = arrayOfLines.stream()
                .flatMap(l -> Arrays.stream(l.split("\\s+")))
                .collect(Collectors.toList());

        List<String> matchingWords = new ArrayList<>();
        for (int i = 1; i < words.size(); i++) {
            String previousWord = words.get(i - 1);
            String currentWord = words.get(i);
            if (previousWord.charAt(previousWord.toLowerCase().length() - 1) == currentWord.toLowerCase().charAt(0)) {
                matchingWords.add(previousWord);
                matchingWords.add(currentWord);
            }
        }
        System.out.println("\nWords for which the last letter of one word" +
                "matches the first letter of the next word.");
        System.out.println(matchingWords);
    }

    private List<String> fileToList(String fileName, List<String> lines) {
        try {
            BUFFERED_READER = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        while (true) {
            try {
                if (!((line = BUFFERED_READER.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            lines.add(line);
        }
        return lines;
    }
}

