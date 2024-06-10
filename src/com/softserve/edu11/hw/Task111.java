package com.softserve.edu11.hw;

import java.util.Arrays;
import java.util.Comparator;

public class Task111 {

    public static void execute(){
        String input = "task involves inputting a sentence";
        System.out.println(input);
        String longest = findLongest(input);
        System.out.println("The longest word is: " + longest + ", of " + longest.length() + " letters");
        System.out.println("Second word reversed: " + reversed(input));
    }

    private static String findLongest(String sentence){
        String[] words = sentence.split(" ");
        Arrays.sort(words, Comparator.comparing(String::length).reversed());
        return words[0];
    }

    private static String reversed(String sentence){
        StringBuilder output = new StringBuilder();
        String[] words = sentence.split(" ");
        String[] second = words[1].split("");

        for(int i=second.length-1; i >= 0; i--){
            output.append(second[i]);
        }

        return output.toString();
    }


}
