package com.softserve.edu16.pt;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static File myfile = new File("src/com/softserve/edu16/pt/mytext.txt");

    public static void main(String[] args) {
        practicalTask1();
        System.out.println("End of the first practical task");

        practicalTask2();
        System.out.println("End of the second practical task");
    }

    public static void practicalTask1() {
        String [] lines;
        String line = "";
        List<String> linesList = new ArrayList<>();

        try {
            Reader reader = new FileReader(myfile);
            BufferedReader bufferedReader = new BufferedReader(reader);


            line = bufferedReader.readLine();
            while (line != null) {
                linesList.add(line);
                line = bufferedReader.readLine();
            }

            lines = linesList.toArray(new String[0]);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        countSymbols(lines);
        longAndShortLine(lines);
        linesWithVar(lines);
    }

    public static void countSymbols (String [] lines) {
        int count = 1;
        for (String line : lines) {
            line = line.replaceAll("\\s","");
            System.out.println("The number of symbols in " + count + " line is " + line.length());
            count++;
        }
    }

    public static void longAndShortLine (String [] lines) {
        String longestLine = lines[0];
        String shortestLine = lines[0];
        int longest = lines[0].replaceAll("\\s", "").length();
        int shortest = lines[0].replaceAll("\\s", "").length();

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].replaceAll("\\s", "").length() > longest) {
                longest = lines[i].replaceAll("\\s", "").length();
                longestLine = lines[i];
            } else if (lines[i].replaceAll("\\s", "").length() < shortest) {
                shortest = lines[i].replaceAll("\\s", "").length();
                shortestLine = lines[i];
            }
        }

        System.out.println("The longest line is: " + "\n" + longestLine + "\n" + "with " + longest + " symbols");
        System.out.println("The shortest line is: " + "\n" + shortestLine + "\n" + "with " + shortest + " symbols");
    }

    public static void linesWithVar (String [] lines) {
        String line = "";
        System.out.println("Lines which consist of word var");

        for (String item : lines) {

            if (item.contains("var")) {
                line = item;
                System.out.println(line);
            }
        }

        if (line.equals("")) {
            System.out.println("There is no string with the word var in the string array");
        }
    }

    public static void practicalTask2() {
        char [] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        String [] words;
        String word = " ";
        String line = "";
        List<String> wordList = new ArrayList<>();

        try {
            Reader reader = new FileReader(myfile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            int count = 1;


            line = bufferedReader.readLine();
            while (line != null) {
                words = line.split("[\\s,.-]+");
                System.out.println("Words, which start with vowel in " + count + " line");
                for (String item : words) {
                    if (word.charAt(word.length() - 1) == item.charAt(0)) {
                        wordList.add(word);
                        wordList.add(item);
                    }
                    for (char vowel : vowels) {
                        if (item.toLowerCase().startsWith(String.valueOf(vowel))) {
                            System.out.println(item);
                        }
                    }
                    word = item;
                }
                count++;
                line = bufferedReader.readLine();
            }

            System.out.println("List of words which the last letter of one word matches the first letter of the next word" +
                    "\n" + wordList.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
