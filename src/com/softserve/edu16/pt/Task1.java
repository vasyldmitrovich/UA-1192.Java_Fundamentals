package com.softserve.edu16.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {// Ok but use try catch in method and catch IOException
        int countCharacters = 0;
        String testWord;
        String character;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input word:");
        testWord = br.readLine();

        System.out.println("Input character:");
        character = br.readLine();

        if (character.length() != 1) {
            System.out.println("Please input exactly one character.");
            return;
        }

        for (int i = 0; i < testWord.length(); i++) {
            String currentChar = testWord.substring(i, i + 1);
            if (currentChar.equals(character)) {
                countCharacters++;
            }
        }

        System.out.println("There are character '" + character + "' " + countCharacters + " times in the word '" + testWord + "'.");
    }
}
