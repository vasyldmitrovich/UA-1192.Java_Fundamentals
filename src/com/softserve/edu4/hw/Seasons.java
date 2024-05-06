package com.softserve.edu4.hw;

public enum Seasons {

    AUTUMN("Autumn", "The first semester"), SPRING("Spring", "The second semester"),
    SUMMER("Summer", "The vacation period"), WINTER("Winter", "The period of exam");

    private final String season;
    private final String semester;

    private Seasons(final String season, final String semester) {
        this.season = season;
        this.semester = semester;
    }

    public String getSeason() {
        return this.season;
    }

    public String getSemester() {
        return this.semester;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "season='" + season + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
