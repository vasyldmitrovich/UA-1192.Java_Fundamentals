package com.softserve.edu04.hw;

import java.util.Scanner;

public class Faculty {
    public int numberOfStudents;
    public Season currentSeason;
    private static final Scanner scanner = new Scanner(System.in);

    public Faculty() {
    }

    public int setNumber(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "{" +
                "numberOfStudents=" + numberOfStudents +
                ", currentSeason=" + currentSeason.getName() +
                '}';
    }
}


