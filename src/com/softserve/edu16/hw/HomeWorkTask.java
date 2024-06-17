package com.softserve.edu16.hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HomeWorkTask {
    private static BufferedReader BUFFERED_READER = null;
    private static PrintWriter PRINT_WRITER = null;

    public void task1() {

        String fileName = "file1.txt";
        String fileName2 = "file2.txt";
        List<String> listOfLines = new ArrayList<>();

//        Copy from file to List
        fileToList(fileName, listOfLines);

//        list to array
        String[] arrayOfLines = new String[listOfLines.size()];
        listOfLines.toArray(arrayOfLines);

//        get number of not empty lines
        int linesNumber = (int) listOfLines.stream()
                .filter(l -> !l.isEmpty())
                .count();

//        get the longest line
        String longestLine = Arrays.stream(arrayOfLines)
                .max(Comparator.comparing(String::length))
                .orElse("");

        String name = "Oleksandr";
        LocalDate myBirthday = LocalDate.of(1993, 8, 20);

        try {
            PRINT_WRITER = new PrintWriter(fileName2);
            PRINT_WRITER.println(linesNumber + "\n" + longestLine + "\n" + name + "\n" + myBirthday);
            PRINT_WRITER.close();
        } catch (IOException e) {
            System.out.println("File Write Error: " + fileName2);
        }
        System.out.println("File write successful: "+fileName2);
    }

    public void task2() {

        String fileName = "filejava.txt";
        String newFileName = "filejavanew.txt";
        List<String> listOfLines = new ArrayList<>();

        fileToList(fileName, listOfLines);

        List<String> newList = listOfLines.stream()
                .map(element -> element.replace("public", "private"))
                .toList();

        try {
            PRINT_WRITER = new PrintWriter(newFileName);
            for (String line : newList) {
                PRINT_WRITER.println(line);
            }
            PRINT_WRITER.close();
        } catch (IOException e) {
            System.out.println("File Write Error: " + newFileName);
        }
        System.out.println("File write successful: "+newFileName);
    }

    private void fileToList(String fileName, List<String> lines) {
        try {
            BUFFERED_READER = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line;
        while (true) {
            try {
                if ((line = BUFFERED_READER.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            lines.add(line);
        }
    }
}
