package com.softserve.edu11_str.hw;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
        task4();

    }

    public static void task1() {

        System.out.println("Task 1");

        String sent = "Ukraine has not perished";

        String[] words = sent.split(" ");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        int numLetters = longestWord.length();
        System.out.println("The longest word is: " + longestWord + " and length is " + numLetters);

        String secondWordReversed = new StringBuilder(words[1]).reverse().toString();
        System.out.println("The second word in reverse order is: " + secondWordReversed);
    }


    public static void task2() {

        System.out.println("Task 2");

        String sent = "I    am    learning     Java    Fundamental        ";
        String sent2 = sent.trim();

        System.out.println(sent + "\n" + sent2);
        System.out.println(sent2.replaceAll("[\\s]{2,}", " "));
    }


    public static void task3() {

        System.out.println("Task 3");

        String sent = "First $2256.25, second $5636.15, third $25";

        String pattern ="\\$\\d+\\.\\d{2}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sent);

        while (m.find()) {
            System.out.print(" *" + sent.substring(m.start(), m.end()) + "* ");
        }
    }

    public static void task4() {

        String firstName = "";
        String lastName = "";


        String namePattern = "^[a-zA-Z\\s-]+$";
        Pattern pattern = Pattern.compile(namePattern);


        while (true) {
            System.out.print("Enter your first name: ");
            firstName = SCANNER.nextLine();
            if (pattern.matcher(firstName).matches()) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid first name.");
            }
        }


        while (true) {
            System.out.print("Enter your last name: ");
            lastName = SCANNER.nextLine();
            if (pattern.matcher(lastName).matches()) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid last name.");
            }
        }

        String[] greetings = {
                "Hello, %s %s! Welcome!",
                "Hi, %s %s! Great to see you!",
                "Greetings, %s %s!",
                "Hey, %s %s!",
                "Good day, %s %s!"
        };


        Random random = new Random();
        int index = random.nextInt(greetings.length);
        String greetingMessage = greetings[index];


        System.out.printf(greetingMessage, firstName, lastName);
    }
}
