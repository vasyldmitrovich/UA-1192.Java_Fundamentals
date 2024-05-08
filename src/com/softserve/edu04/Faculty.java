package com.softserve.edu04;
import java.util.Scanner;

public class Faculty {
    enum Season {// Move to Season.java
        WINTER("Winter"),
        SPRING("Spring"),
        SUMMER("Summer"),
        AUTUMN("Autumn");

        private final String name;

        Season(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public static void main(String[] args) {// Move to App.java
        Scanner scanner = new Scanner(System.in);

        System.out.println("input qountity of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Поглинаємо символ нового рядка

        System.out.println("input exact season (Winter, Spring, Summer, Autumn):");
        String seasonInput = scanner.nextLine().toUpperCase();

        Season currentSeason = null;
        try {
            currentSeason = Season.valueOf(seasonInput);
        } catch (IllegalArgumentException e) {
            System.out.println("not corect input for season.");
            System.exit(1);
        }

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);
        System.out.println("infotmation adout faculty:");
        System.out.println("qountity of students: " + faculty.numberOfStudents);
        System.out.println("exact season: " + faculty.currentSeason.getName());

        scanner.close();
    }
}
