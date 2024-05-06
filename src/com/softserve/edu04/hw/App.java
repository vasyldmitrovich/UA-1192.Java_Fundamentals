package com.softserve.edu04.hw;

import java.util.Scanner;

public class App {

    private static final Scanner SC = new Scanner(System.in);
    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        System.out.println("Task 1");
        demonstrateInRangeTask();
        System.out.println();
        System.out.println("Task 2");
        demonstrateMinMaxTask();
        System.out.println();
        System.out.println("Task 3");
        demonstrateHTTPErrorTask();
        System.out.println();
        System.out.println("Task 4");
        demonstrateFacultyTask();
        System.out.println();
        System.out.println("Task 5");
        demonstrateDogTask();
    }

    private static void demonstrateInRangeTask() {
        System.out.print("Input three numbers by space: ");
        String numbersString = SC.nextLine();
        float[] numbers = NumberUtil.stringToFloat(numbersString, DELIMITER);

        boolean isInRange = NumberUtil.isInRange(-5f, 5f, numbers);
        if (isInRange) {
            System.out.println("All numbers is in range");
        } else {
            System.out.println("Not all numbers is in range");
        }
    }

    private static void demonstrateMinMaxTask() {
        System.out.print("Input three numbers by space: ");
        String numbersString = SC.nextLine();
        int[] numbers = NumberUtil.stringToInt(numbersString, DELIMITER);

        int maxNumber = NumberUtil.getMax(numbers);
        int minNumber = NumberUtil.getMin(numbers);
        System.out.println("Max: " + maxNumber);
        System.out.println("Min: " + minNumber);
    }

    private static void demonstrateHTTPErrorTask() {
        System.out.print("Input HTTP error's code: ");
        int errorCode = Integer.parseInt(SC.nextLine());
        HTTPError httpError = HTTPError.of(errorCode);
        if (httpError == null) {
            System.out.println("Sorry. Nothing found with code " + errorCode);
        } else {
            System.out.println("Error: " + httpError.name());
        }
    }

    private static void demonstrateFacultyTask() {
        System.out.print("Input faculty's name: ");
        String name = SC.nextLine();
        System.out.print("Input quantity of students: ");
        int quantity = Integer.parseInt(SC.nextLine());
        System.out.print("Input season: ");
        Season season;
        do {
            season = Season.of(SC.nextLine());
            if (season == null) {
                System.out.print("Invalid season. Try again: ");
            }
        } while (season == null);

        Faculty faculty = new Faculty(name, quantity, season);
        System.out.println(faculty);
        System.out.printf("Current season: %s - %s%n", Faculty.getCurrentSeason().getName(),
                Faculty.getCurrentSeason().getGraduationActivity());
    }

    private static void demonstrateDogTask() {
        Dog[] dogs = new Dog[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Dog " + (i + 1));
            dogs[i] = Dog.input(System.in);
            System.out.println();
        }

        System.out.println("Dogs: ");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        if (Dog.allHasDiffName(dogs)) {
            System.out.println("All dogs have different names");
        } else {
            System.out.println("Some dogs have the same name");
        }
        System.out.println("The oldest dog: " + Dog.getOldest(dogs));
    }
}
