package com.softserve.edu16.pt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 1");
        task1();

        System.out.println("Task 2");
        task2();
    }

    public static void task1() throws IOException {

        String[] lines = Files.readAllLines(Paths.get("resources/mytext.txt")).toArray(new String[0]);

        for (String line : lines) {
            System.out.println(line);
        }

        for (int i = 0; i < lines.length; i++) {
            System.out.println("\nNumber of symbols in string " + (i + 1) + ": " + lines[i].length());
        }

        String shortest = Arrays.stream(lines)
                .min(Comparator.comparing(String::length)).orElse("");
        System.out.println("\nShortest string: " + shortest);

        List<String> varLines = Arrays.stream(lines)
                .filter(s -> s.contains("var")).toList();
        System.out.println("\nLines with var: ");

        for (String s : varLines) {
            System.out.println(s);
        }

    }

    public static void task2() throws IOException {
        String[] lines = Files.readAllLines(Paths.get("resources/mytext.txt")).toArray(new String[0]);

        String[] words = Arrays.stream(lines)
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .toArray(String[]::new);

        System.out.println("Words starting with a vowel:");
        for (String word : words) {

            if (word.matches("^[AEIOUaeiouАЕЁИОУЫЭЮЯаеёиоуыэюя].*")) {
                System.out.println(word);
            }

        }

        System.out.println("\nWords where the last letter matches the first letter of the next word:");
        for (int i = 0; i < words.length - 1; i++) {

            String currentWord = words[i];
            String nextWord = words[i + 1];

            if (currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0)) {
                System.out.println(currentWord + " " + nextWord);
            }

        }
    }
}
