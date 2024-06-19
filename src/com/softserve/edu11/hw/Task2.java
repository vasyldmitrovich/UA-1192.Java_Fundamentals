package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String modifiedSentence = inputSentence.replaceAll("\\s+", " ");

        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }
}
