package com.softserve.edu16.ptask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppPt {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        String fileName = "src/com/softserve/edu16/ptask/mytext.txt";
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        int longestLength = 0;
        int shortestLength = Integer.MAX_VALUE;
        String longestLine = "";
        String shortestLine = "";

        System.out.println("Number of symbols in each line:");
        for (String line : lines) {
            int length = line.length();
            System.out.println(length);

            if (length > longestLength) {
                longestLength = length;
                longestLine = line;
            }
            if (length < shortestLength) {
                shortestLength = length;
                shortestLine = line;
            }
        }

        System.out.println("Longest Line (" + longestLength + " symbols): " + longestLine);
        System.out.println("Shortest Line (" + shortestLength + " symbols): " + shortestLine);

        System.out.println("Lines containing the word 'var':");
        lines.stream().filter(line -> line.contains("var")).forEach(System.out::println);
    }

    public static void task2() {
        String fileName = "src/com/softserve/edu16/ptask/mytext.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            Pattern vowelPattern = Pattern.compile("\\b[aeiouAEIOU]\\w*\\b");

            System.out.println("Words starting with a vowel: ");
            for (String line : lines) {
                Matcher matcher = vowelPattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }
        } catch (IOException e) {
            System.err.println("File read error: " + e.getMessage());
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            System.out.println("Words where the last letter of one word matches the first letter of the next word: ");
            for (String line : lines) {
                String[] words = line.split("\\s+");
                for (int i = 0; i < words.length - 1; i++) {
                    if (!words[i].isEmpty() && !words[i + 1].isEmpty()) {
                        char lastChar = words[i].charAt(words[i].length() - 1);
                        char firstChar = words[i + 1].charAt(0);
                        if (lastChar == firstChar) {
                            System.out.println(words[i] + " " + words[i + 1]);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("File read error: " + e.getMessage());
        }
    }
}
