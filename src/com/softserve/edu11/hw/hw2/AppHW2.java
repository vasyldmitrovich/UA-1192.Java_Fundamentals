package com.softserve.edu11.hw.hw2;

public class AppHW2 {
    String sentence = "I  am  learning  Java  Fundamental";

    public static void main(String[] args) {
        AppHW2 homework2 = new AppHW2();
        String newSentence = homework2.sentence.replaceAll("\\s+", " ");
        System.out.println("Starting sentence: " + homework2.sentence);
        System.out.println("Sentence with replace: " + newSentence);
    }
}
