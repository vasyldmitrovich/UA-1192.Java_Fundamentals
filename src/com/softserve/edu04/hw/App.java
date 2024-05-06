package com.softserve.edu04.hw;

import com.softserve.edu04.pt.Season;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Input first number: ");
        float number1 = scanner.nextFloat();
        System.out.println("Input second number: ");
        float number2 = scanner.nextFloat();
        System.out.println("Input third number: ");
        float number3 = scanner.nextFloat();
        boolean inRange = number1 >= -5 && number1 <= 5 && number2 >= -5 && number2 <= 5 && number3 >= -5 && number3 <= 5;
        if (inRange) {
            System.out.println("All numbers belong to the interval [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the interval [-5, 5]");
        }
    }

    public static void task2() {
        System.out.println("Input first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Input third number: ");
        int number3 = scanner.nextInt();
        int max = Math.max(Math.max(number1, number2), number3);
        int min = Math.min(Math.min(number1, number2), number3);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void task3() {
        System.out.println("Input http error code: ");
        int httpErrorCode = scanner.nextInt();

        HTTPError error = getHTTPError(httpErrorCode);
        if (error != null) {
            System.out.println("Error " + httpErrorCode + " - " + error.getDescription());
        } else {
            System.out.println("Can`t find error description for " + httpErrorCode);
        }
    }

    public static void task4() {
        try {
            System.out.println("Input number of students: ");
            int numberOfStudents = scanner.nextInt();
            System.out.println("Input season name: ");
            String seasonName = scanner.next();

            Season season = null;
            for (Season s : Season.values()) {
                if (s.getName().equalsIgnoreCase(seasonName)) {
                    season = s;
                    break;
                }
            }

            Faculty faculty = new Faculty(numberOfStudents, season);
            System.out.println("Faculty season: " + faculty.getSeason() + ", number of students: " + faculty.getNumberOfStudents());
        } catch (InputMismatchException exception) {
            System.out.println("Invalid number of students");
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid season name");
        }
    }

    public static HTTPError getHTTPError(int errorCode) {
        for (HTTPError error : HTTPError.values()) {
            if (errorCode == Integer.parseInt(error.name().substring(error.name().indexOf('_') + 1))) {
                return error;
            }
        }
        return null;
    }
}
