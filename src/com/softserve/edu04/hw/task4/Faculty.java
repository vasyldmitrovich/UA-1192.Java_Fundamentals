package com.softserve.edu04.hw.task4;

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public Season getCurrentSeason() {
        return this.currentSeason;
    }
}



