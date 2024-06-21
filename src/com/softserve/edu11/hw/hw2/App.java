package com.softserve.edu11.hw.hw2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        String Sentence = "I  am  learning  Java  Fundamental";
        System.out.println(Sentence);
        String normalizedSentence = Sentence.replaceAll("\\s+", " ");

        System.out.println("Normal sentence: " + normalizedSentence);

    }
}

