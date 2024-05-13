package com.softserve.edu04.hw;

public class Faculty {
    private int numberStud;
    private String currentSeason;

    public Faculty() {
    }

    public Faculty(int numberStud, Season season) {
        this.numberStud = numberStud;
        this.currentSeason = season.getPeriod();
    }

    public int getNumberStud() {
        return numberStud;
    }


    public String getCurrentSeason() {
        return currentSeason;
    }



}
