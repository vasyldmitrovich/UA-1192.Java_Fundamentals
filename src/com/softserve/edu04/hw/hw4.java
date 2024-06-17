package com.softserve.edu04.hw;

import java.util.Scanner;

public class hw4 {// Name of class should start from Uppercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");

        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter the current season (Winter, Spring, Summer, Autumn):");

        Season currentSeason = Season.valueOf(scanner.next().toUpperCase());

        scanner.close();

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("Faculty Information:");
        System.out.println("Number of Students: " + faculty.getNumberOfStudents());
        System.out.println("Current Season: " + faculty.getCurrentSeason().getName());
        System.out.println("Current period: " + currentSeason.getPeriodData(
                faculty.getCurrentSeason().getName()));
    }
}

