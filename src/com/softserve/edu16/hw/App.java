package com.softserve.edu16.hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
//        System.out.println("Task 1");
//        task1();

        System.out.println("Task 2");
        task2();
    }

    public static void task1() {
        String inputFileName = "resources/file1.txt";
        String outputFileName = "resources/file2.txt";
        String name = "Vova Saienko";
        String birthDate = "08.05.2000";

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFileName));

            String longestLine = lines.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
                writer.write("Number of lines: " + lines.size());
                writer.newLine();

                writer.write("Longest line: " + longestLine);
                writer.newLine();

                writer.write("Name: " + name);
                writer.newLine();

                writer.write("Birthdate: " + birthDate);
                writer.newLine();
            }

            System.out.println("Data has been written to " + outputFileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task2() {
        String inputFileName = "resources/source.java";
        String outputFileName = "resources/result.java";

        try {

            List<String> lines = Files.readAllLines(Paths.get(inputFileName));

            Pattern pattern = Pattern.compile("\\bpublic\\b");

            lines.replaceAll(input -> pattern.matcher(input).replaceAll("private"));

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
                for (String line : lines) {

                    writer.write(line);
                    writer.newLine();

                }
            }

            System.out.println("Replacement complete. Check the file: " + outputFileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
