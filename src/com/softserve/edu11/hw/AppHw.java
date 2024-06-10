package com.softserve.edu11.hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppHw {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] GREETING = {
            "%s, Welcome in this application.",
            "We glad to see you, %s.",
            "Hi, %s.", "Hi, my dear %s",
            "Hi, %s! Nice to see you!",
            "Greetings, %s! How are you today?",
            "Hey, %s! Hope you're having a great day!",
            "Good day, %s! Pleasure to meet you!"};

    public static void main(String[] args) {
        //  firstHw();
        //secondHw();
        //thirdHw();
        fourthHw();
    }

    private static void firstHw() {
        System.out.println("input sentence with 5 words");
        String sentence = scanner.nextLine();

        String pattern = "^([a-zA-Z0-9]+\\s){4}[a-zA-Z0-9]+$";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(sentence);

        if (matcher.matches()) {
            String arr[] = sentence.split(" ");
            System.out.println(Arrays.toString(arr));

            findLongestWordAndNumber(arr);

            StringBuilder str = new StringBuilder(arr[1]);
            System.out.println("Reverse order second word:" + str.reverse());
        } else {
            System.out.println("Your sentence wrong");
        }

    }

    private static void findLongestWordAndNumber(String[] arr) {
        int max = arr[0].length();
        String maxWord = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length()) {
                max = arr[i].length();
                maxWord = arr[i];
            }
        }

        System.out.println("Your word with max symbols:" + maxWord);
        System.out.println("Count of symbols:" + max);
    }

    private static void secondHw() {
        System.out.println("Enter a sentence with two or more spaces between words");
        String str = scanner.nextLine();

        str = str.replaceAll("\\s+", " ");
        System.out.println("Replaced text:" + str);

    }

    private static void thirdHw() {
        String pattern = "\\$\\d+(\\.\\d{2})";
        System.out.println("Input a text containing several instances of US currency format like $99.99");
        String text = scanner.nextLine();

        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(text);

        System.out.println("Appropriate values:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void fourthHw() {
        String patern = "^[a-zA-Z\\s-]+$";

        System.out.println("Enter first name and second name ");
        String firstLastName = scanner.nextLine();

        Pattern p = Pattern.compile(patern);
        Matcher matcher = p.matcher(firstLastName);

        while (!matcher.matches()) {
            System.out.println("You entered a wrong value, please repeat");
            System.out.println("Enter first name and second name ");

            firstLastName = scanner.nextLine();
            matcher = p.matcher(firstLastName);
        }
        String tempArr[] = firstLastName.split("\\s+");
        String firstname = tempArr[0];

        Random random = new Random();
        String msg = GREETING[random.nextInt(GREETING.length)];
        System.out.printf(msg, firstname);
    }
}
