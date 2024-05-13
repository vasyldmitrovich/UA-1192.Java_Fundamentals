package com.softserve.edu04.hw.task4;

import java.util.Scanner;

public class Main {// Very nice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter the current season (Winter, Spring, Summer, Autumn):");
        String seasonInput = scanner.next();
        Season currentSeason = Season.valueOf(seasonInput.toUpperCase());

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("Faculty information:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason());
    }
}
