package com.softserve.edu11.hw11;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        sentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Result: " + sentence);
    }
}
