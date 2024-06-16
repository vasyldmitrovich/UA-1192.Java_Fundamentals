package com.softserve.edu16.pt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    private static final File SRC = new File("src/com/softserve/edu16/pt/mytext.txt");
    private static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateLinesTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateWordsTask();
    }

    private static void demonstrateLinesTask() {
        String[] lines = new String[0];

        try (Reader r = new FileReader(SRC);
             BufferedReader br = new BufferedReader(r)) {
            String read;
            List<String> list = new ArrayList<>();

            while((read = br.readLine()) != null) {
                list.add(read);
            }

            lines = list.toArray(new String[0]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        printSymbolsCount(lines);
        System.out.println();
        printVarLines(lines);
        System.out.println();
        printShortestLongestLine(lines);
    }

    private static void demonstrateWordsTask() {
        try (Reader r = new FileReader(SRC);
             BufferedReader br = new BufferedReader(r)) {
            String read;
            String previousWord = null;
            List<String> list = new ArrayList<>();

            System.out.println("Starts with vowel:");
            while((read = br.readLine()) != null) {
                String[] words = read.split("[\\s,.-]+");
                for (String word : words) {
                    if (previousWord != null &&
                            previousWord.charAt(previousWord.length() - 1) == word.charAt(0)) {
                        list.add(previousWord);
                        list.add(word);
                    }

                    if (VOWELS.contains(word.charAt(0))) {
                        System.out.print(word + ' ');
                    }

                    previousWord = word;
                }
            }

            System.out.println();
            System.out.println("Word pairs:");
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println(list.get(i) + ' ' + list.get(i + 1));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printSymbolsCount(String[] lines) {
        String symbolRegex = "\\S";
        Pattern symbolPattern = Pattern.compile(symbolRegex);

        for (int i = 0; i < lines.length; i++) {
            int symbolsCount = (int) symbolPattern.matcher(lines[i]).results().count();
            System.out.printf("Line %d: %d symbols%n", i, symbolsCount);
        }
    }

    private static void printShortestLongestLine(String[] lines) {
        if (lines != null && lines.length > 1) {
            String shortest = lines[0];
            String longest = lines[0];

            for (String line : lines) {
                if (line.length() < shortest.length()) {
                    shortest = line;
                }
                if (line.length() > longest.length()) {
                    longest = line;
                }
            }

            System.out.println("Shortest line (" + shortest.length() + " characters): " + shortest);
            System.out.println("Longest line (" + longest.length() + " characters): " + longest);
        }
    }

    private static void printVarLines(String[] lines) {
        String varRegex = "^(var| )+$";
        Pattern varPattern = Pattern.compile(varRegex);

        System.out.println("Var lines:");
        for (int i = 0; i < lines.length; i++) {
            if (varPattern.matcher(lines[i]).matches()) {
                System.out.printf("Line %d: %s%n", i, lines[i]);
            }
        }
    }
}
