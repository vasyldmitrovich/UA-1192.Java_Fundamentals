package com.softserve.edu04.HW.hw4.Enum;

import java.util.Scanner;

public class Faculty {

    private int numberOfStudents;
    private Faculty currentSeason;

    public Faculty(int numberOfStudents,Faculty currentSeason) {
        this.numberOfStudents=numberOfStudents;
        this.currentSeason=currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setGetGetNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;

    }
}