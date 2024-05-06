package com.softserve.edu4.hw;

public class Faculty {

    private int numberOfStudents;
    private Seasons seasons;

    Faculty() {}

    Faculty (int numberOfStudents, Seasons seasons) {
        this.numberOfStudents = numberOfStudents;
        this.seasons = seasons;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public void setSeasons(Seasons seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "numberOfStudents=" + numberOfStudents +
                ", seasons=" + seasons +
                '}';
    }
}
