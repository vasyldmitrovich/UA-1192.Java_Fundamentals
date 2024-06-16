package com.softserve.edu16.hw;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class App {

    private static final File SRC = new File("src/com/softserve/edu16/hw/file1.txt");
    private static final File DEST = new File("src/com/softserve/edu16/hw/file2.txt");
    private static final File JAVA_SRC = new File("src/com/softserve/edu16/hw/App.java");
    private static final File JAVA_DEST = new File("src/com/softserve/edu16/hw/mod/App.java");

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateCareerTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateJavaFileTask();
    }

    private static void demonstrateCareerTask() {
        String[] lines = readLines();
        String longestLine = Arrays.stream(lines)
                .max(String::compareTo)
                .orElse("");
        writeInfo(lines.length, longestLine);
    }

    private static void demonstrateJavaFileTask() {
        try (Reader r = new FileReader(JAVA_SRC);
             BufferedReader br = new BufferedReader(r);
             Writer w = new FileWriter(JAVA_DEST);
             BufferedWriter bw = new BufferedWriter(w)) {
            String read;
            String regex = "(class)|(enum)|(interface)";
            Pattern pattern = Pattern.compile(regex);

            while ((read = br.readLine()) != null) {
                if (read.contains("public") && !pattern.matcher(read).find()) {
                    read = read.replace("public", "private");
                }

                bw.write(read);
                bw.newLine();
            }

            System.out.println("File rewrote successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String[] readLines() {
        String[] lines = new String[0];

        try (Reader r = new FileReader(SRC);
             BufferedReader br = new BufferedReader(r)) {
            String read;
            List<String> list = new ArrayList<>();

            while ((read = br.readLine()) != null) {
                list.add(read);
            }

            lines = list.toArray(new String[0]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lines;
    }

    private static void writeInfo(int linesCount, String longestLine) {
        try (Writer w = new FileWriter(DEST);
             BufferedWriter bw = new BufferedWriter(w)) {
            bw.write("Number of lines: " + linesCount);
            bw.newLine();
            bw.write("Longest line: \n" + longestLine);
            bw.newLine();
            bw.write("Rostyslav 06.03.2002");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
