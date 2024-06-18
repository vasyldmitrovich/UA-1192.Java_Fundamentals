package com.softserve.edu16.hwork;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppHw {
    public static void main(String[] args) {// Ok
        task1();
        task2();
    }

    public static void task1() {
        String fileName1 = "src/com/softserve/edu16/hwork/file1.txt";
        String fileName2 = "src/com/softserve/edu16/hwork/file2.txt";

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(fileName1));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter out = new FileWriter(fileName2)) {
            out.write("Number of lines: " + lines.size() + System.lineSeparator());

            String longestLine = Collections.max(lines, Comparator.comparingInt(String::length));
            out.write("The longest line : " + longestLine + System.lineSeparator());

            out.write("Name: Anastasia" + System.lineSeparator());
            out.write("Birthday date: 21.10.2001" + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task2() {
        String inputFile = "src/com/softserve/edu16/hwork/javafile.txt";
        String outputFile = "src/com/softserve/edu16/hwork/newjavafile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("public ", "private ");
                writer.write(line);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        } catch (IOException e) {
            System.out.println("File read/write error.");
        }
    }
}

