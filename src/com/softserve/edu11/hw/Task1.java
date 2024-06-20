package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {// Ok
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence of five words: ");
        String sentence = scanner.nextLine();

        SentenceProcessor processor = new SentenceProcessor();

        processor.findAndPrintLongestWord(sentence);
        processor.printSecondWordReversed(sentence);
    }
}