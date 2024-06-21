package com.softserve.first_project;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;


public class ConsoleTextEditor {

    static Scanner scanner = new Scanner(System.in);

    private static StringBuilder textContent = new StringBuilder();

    public static void main
            (String[] args) {
        boolean running = true;

        while (running) {

            System.out.println("Select an option:");
            System.out.println("1. Open the file");
            System.out.println("2. Save the file");
            System.out.println("3. Find and replace text");
            System.out.println("4. Print text");
            System.out.println("5. Go out");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    openFile();
                    break;
                case "2":
                    saveFile();
                    break;
                case "3":
                    findAndReplace();
                    break;
                case "4":
                    printText();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }
    }

    private static void openFile() {

        System.out.println("Enter the file path");
        String filePath = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            textContent.setLength(0); // Очистити попередній текст
            String line;
            while ((line = reader.readLine()) != null) {
                textContent.append(line).append(System.lineSeparator());
            }
            System.out.println("File opened successfully:");
            
        } catch (IOException e) {
            System.out.println("Failed to open the file: " + e.getMessage());
        }
    }

    private static void saveFile() {

        System.out.println("Enter the file path to save:");
        String filePath = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(textContent.toString());
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save the file:" + e.getMessage());
        }
    }


    private static void findAndReplace() {
        System.out.println("Enter the text to find:");
        String findText = scanner.nextLine();
        System.out.println("Enter the text to change:");
        String replaceText = scanner.nextLine();

        String content = textContent.toString();
        String updatedContent = Pattern.compile(findText).matcher(content).replaceAll(replaceText);
        textContent.setLength(0);
        textContent.append(updatedContent);
        printText();

    }


    private static void printText() {

        System.out.println("Current text:");
        System.out.println(textContent.toString());
    }

}