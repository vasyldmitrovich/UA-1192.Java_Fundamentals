package com.softserve.edu11.hw;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    private static final Scanner SC = new Scanner(System.in);
    private static final String[] GREETINGS = {"Welcome, %s. Let's get started!",
        "Hello %s, your validation is successful!", "Hi %s, congratulations on validation!"};
    private static final Random RAND = new Random(System.currentTimeMillis());

    public static void main(String[] args) {// Good
        System.out.println("Task 1");
        demonstrateSentenceTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateSpacesTask();
        System.out.println();

        System.out.println("Task 3");
        demonstrateCurrencyTask();
        System.out.println();

        System.out.println("Task 4");
        demonstrateNamesTask();
    }

    private static void demonstrateSentenceTask() {
        System.out.println("Input sentence:");
        String sentence = SC.nextLine();

        String regex = "[\\s,.]+";
        String[] words = sentence.split(regex);
        List<String> list = Arrays.asList(words);

//        String secondWord = words[words.length - 2];
//        String secondWord = list.get(list.size() - 2);
        Collections.reverse(list);
        String secondWord = list.get(1);

        list.sort((e1, e2) -> Integer.compare(e2.length(), e1.length()));
        String longestWord = list.get(0);

        System.out.printf("Longest word is %s, and it has %d chars%n",
                longestWord, longestWord.length());
        System.out.printf("Second word in reversed sentence is %s%n", secondWord);
    }

    private static void demonstrateSpacesTask() {
        System.out.println("Input sentence:");
        String sentence = SC.nextLine();

        String regex = "\\s+";
        String result = sentence.replaceAll(regex, " ");
        System.out.println("Replaced:");
        System.out.println(result);
    }

    private static void demonstrateCurrencyTask() {
        System.out.println("Input sentence with currencies:");
        String sentence = SC.nextLine();

        String regex = "(\\d+.\\d{2}\\$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println(sentence.substring(matcher.start(), matcher.end()));
        }
    }

    private static void demonstrateNamesTask() {
        String regex = "[A-Za-z-]+ [A-Za-z-]+";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Input full name:");
        String fullName = SC.nextLine();
        Matcher matcher = pattern.matcher(fullName);

        while (!matcher.matches()) {
            System.out.println("Invalid full name. Input again:");
            fullName = SC.nextLine();
            matcher = pattern.matcher(fullName);
        }

        String greeting = GREETINGS[RAND.nextInt(GREETINGS.length)];
        System.out.printf(greeting, fullName);
        System.out.println();
    }
}
