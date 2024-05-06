package com.softserve.edu04.hw;

public class Faculty {

    private static Season currentSeason;

    private final String name;
    private int studentsQty;

    public Faculty(String name, int studentsQty) {
        this.name = name;
        this.studentsQty = studentsQty;
    }

    public Faculty(String name, int studentsQty, Season season) {
        this.name = name;
        this.studentsQty = studentsQty;
        currentSeason = season;
    }

    public static void setCurrentSeason(Season currentSeason) {
        Faculty.currentSeason = currentSeason;
    }

    public static Season getCurrentSeason() {
        return currentSeason;
    }

    public void setStudentsQty(int studentsQty) {
        this.studentsQty = studentsQty;
    }

    public String getName() {
        return name;
    }

    public int getStudentsQty() {
        return studentsQty;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", studentsQty=" + studentsQty +
                '}';
    }
}
