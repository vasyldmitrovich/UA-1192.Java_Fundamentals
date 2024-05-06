package com.softserve.edu04.hw;

import com.softserve.edu04.pt.Season;

public class Faculty {

    private int numberOfStudents;

    private Season season;

    public Faculty() {
        this.numberOfStudents = 0;
        this.season = null;
    }

    public Faculty(int numberOfStudents, Season season) {
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        switch (season) {
            case AUTUMN -> {
                return "First semester";
            }
            case WINTER -> {
                return "Winter exams";
            }
            case SPRING -> {
                return "Second semester";
            }
            case SUMMER -> {
                return "Vacation period";
            }
            default -> {
                return "Unknown season";
            }
        }
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
