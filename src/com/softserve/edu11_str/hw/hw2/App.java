package com.softserve.edu11_str.hw.hw2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence with words separated by multiple spaces:");
        String sentence = scanner.nextLine();

        // Replace consecutive spaces with a single space
        String modifiedSentence = sentence.replaceAll("\\s+", " ");

        // Output the modified sentence
        System.out.println("Modified sentence:");
        System.out.println(modifiedSentence);

        scanner.close();
    }
}

