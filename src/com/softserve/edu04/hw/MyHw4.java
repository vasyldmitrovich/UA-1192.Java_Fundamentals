package com.softserve.edu04.hw;

import java.util.Scanner;
import java.util.Locale;

public class MyHw4 {// Why all code in one class, separate to different files
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        task1(scanner);
        task2();
        task3(scanner);
        task4(scanner);
        scanner.close();
    }

    public static void task1(Scanner scanner) {
        System.out.println("Enter three float numbers:");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        if (isInRange(num1) && isInRange(num2) && isInRange(num3)) {
            System.out.println("All three numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }

    public static boolean isInRange(float num) {
        return num >= -5 && num <= 5;
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integer numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

    }
    public static void task3(Scanner scanner) {
        System.out.println("Enter an HTTP error code:");
        int errorCode = scanner.nextInt();

        while (errorCode < 400 || errorCode > 415) {
            System.out.println("Invalid HTTP error code. Please enter a number between 400 and 415.");
            System.out.print("Enter an HTTP error code: ");
            errorCode = scanner.nextInt();
        }

        System.out.println("HTTP Error " + errorCode + ": " + getHTTPErrorDescription(errorCode));
    }

    public static String getHTTPErrorDescription(int errorCode) {
        switch (errorCode) {
            case 400:
                return "Bad Request";
            case 401:
                return "Unauthorized";
            case 402:
                return "Payment Required";
            case 403:
                return "Forbidden";
            case 404:
                return "Not Found";
            case 405:
                return "Method Not Allowed";
            case 406:
                return "Not Acceptable";
            case 407:
                return "Proxy Authentication Required";
            case 408:
                return "Request Timeout";
            case 409:
                return "Conflict";
            case 410:
                return "Gone";
            case 411:
                return "Length Required";
            case 412:
                return "Precondition Failed";
            case 413:
                return "Payload Too Large";
            case 414:
                return "URI Too Long";
            case 415:
                return "Unsupported Media Type";
            default:
                return "Unknown Error";
        }
    }

    public static void task4(Scanner scanner) {
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.println("Enter the current season (Winter, Spring, Summer, Autumn):");
        String seasonInput = scanner.nextLine().toUpperCase();

        Season currentSeason;
        try {
            currentSeason = Season.valueOf(seasonInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season input.");
            return;
        }

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("Faculty created with the following information:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getSeasonName());
    }
}

enum Season {// Move to Season.java file not here
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private final String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }
}

class Faculty {// the same
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }
}





