package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static Scanner sc = new Scanner(System.in);
    private static String[] greetings = {"It's good to see you, %s", "What's up %s", "Hey, %s is there!"};

    public static void main(String[] args) {
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second homework");

        homework3();
        System.out.println("End of the third homework");

        homework4();
        System.out.println("End of the fourth homework");
    }

    public static void homework1() {
        System.out.println("Enter a sentence of five words");
        String [] sentence = sc.nextLine().split(" +");

        if (sentence.length != 5) {
            System.out.println("You entered not five words");
        } else {
            theLongestWord(sentence);
            getSecondReverse(sentence);
        }
    }

    public static void theLongestWord (String [] sentence) {
        int size = sentence[0].length();
        String theLongestWord = "";

        for (int i = 1; i < sentence.length; i++) {
            if (size <= sentence[i].length()) {
                theLongestWord = sentence[i];
                size = sentence[i].length();
            }
        }

        System.out.println("The longest word is " + theLongestWord + " and its number of letters is " + theLongestWord.length());
    }

    public static void getSecondReverse (String [] sentence) {
        String secondWord = sentence[1];
        StringBuilder reverseSecond = new StringBuilder();

        for (int i = secondWord.length() - 1; i >= 0; i--) {
            reverseSecond.append(secondWord.charAt(i));
        }

        System.out.println("The second word of the sentence in reverse order is " + reverseSecond);
    }

    public static void homework2 () {
        System.out.println("Enter the String");
        String line = sc.nextLine().replaceAll("\\s+", " ");

        System.out.println("Your string with replaced all consecutive spaces with a single space is: " + "\n"
                + line);
    }

    public static void homework3 () {
        System.out.println("Enter sentence with several instances of US currency format");
        String line = sc.nextLine();

        Pattern pattern = Pattern.compile("\\$\\d+.\\d{2}");
        Matcher matcher = pattern.matcher(line);

        System.out.println("All the occurrences of US currency format is:");
        while (matcher.find()) {
            System.out.println(line.substring(matcher.start(), matcher.end()));
        }
    }

    public static void homework4() {
        System.out.println("Enter the first and last name, that only contains English letters, spaces, and hyphens");
        String fullName = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Za-z-]+ [A-Za-z-]+");
        Matcher matcher = pattern.matcher(fullName);

        while (!matcher.matches()) {
            System.out.println("You enter wrong first or last name. Please enter again");
            fullName = sc.nextLine();
            matcher = pattern.matcher(fullName);
        }

        String greeting = greetings[((int) (Math.random() * 3))];
        System.out.printf(greeting, fullName);
    }
}
