package com.softserve.edu04.hw;

import java.sql.Time;

public class AppTask44 {
    public static void main(String[] args) {
        Faculty faculty = new Faculty(380, Season.FALL);
        System.out.println("Engineering faculty students quantity - " + faculty.getStudents());
        System.out.println("Current period - " + faculty.getCurrentSeason());

    }
}
