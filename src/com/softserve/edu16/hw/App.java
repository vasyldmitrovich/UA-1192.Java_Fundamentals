package com.softserve.edu16.hw;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static File myfile1 = new File("src/com/softserve/edu16/hw/text1.txt");
    public static File myfile2 = new File("src/com/softserve/edu16/hw/text2.txt");
    public static File code = new File("src/com/softserve/edu16/hw/Student.java");
    public static File privateCode = new File("src/com/softserve/edu16/hw/PrivateStudent.java");

    public static void main(String[] args) {
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second homework");
    }

    public static void homework1() {
        String [] lines;
        String line = "";
        List<String> linesList = new ArrayList<>();

        try {
            Reader reader = new FileReader(myfile1);
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

        writeToFile(lines);
    }

    public static void writeToFile (String [] lines) {
        int longest = lines[0].length();
        String longestLine = lines[0];
        for (String line : lines) {
            if (longest < line.length()) {
                longest = line.length();
                longestLine = line;
            }
        }

        try {
            Writer writer = new FileWriter(myfile2);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Number of lines " + lines.length);
            bufferedWriter.newLine();
            bufferedWriter.write("The longest line in file1: " + "\n" + longestLine);
            bufferedWriter.newLine();
            bufferedWriter.write("Marian 29.07.2002");
            bufferedWriter.close();
            System.out.println("The data successfully written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void homework2() {
        String line;

        try {
            Reader reader = new FileReader(code);
            BufferedReader bufferedReader = new BufferedReader(reader);
            Writer writer = new FileWriter(privateCode);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            line = bufferedReader.readLine();
            while (line != null) {
                if (line.contains("public")) {
                    line = line.replace("public", "private");
                }

                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }


            bufferedWriter.close();
            System.out.println("The data successfully changed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
