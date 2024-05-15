package com.softserve.edu04_cond.enum_examples;

public class AppEnum {
    public static void main(String[] args) {

        //***Enum 1***
        Season season;
        season = Season.WINTER;
        System.out.println("season.toString() = " + season); // toString()
        System.out.println("season.name() = " + season.name());

        //***Enum 2***   ***Enum 3***
/*
        Season season = Season.WINTER;
        System.out.println("Current season.name = " + season.name());
        System.out.println("Next season = " + season.nextSeason().name());
        //
        String name = "Spring"; // "Spring1" ERROR
        season = Season.valueOf(name.toUpperCase());
        System.out.println("season.name() = " + season.name());
        System.out.println("Next season.name() = " + season.nextSeason().name());

        for (Season current : Season.values()) {
            System.out.println("current = " + current); // current.toString()
        }
*/

        //***Enum 4***
/*

        Season season = null;
        String month = "Marth";
        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "Marth":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No this month\n");
                throw new IllegalArgumentException("Error: Invalid Argument");
                // System.exit(0);
        }
        System.out.println("season = " + season.toString());
        System.out.println("Next season = " + season.nextSeason());
        //
        switch (season) {
            case WINTER:
                System.out.println("December, January, February");
                break;
            case SPRING:
                //System.out.println("Marth, April, May");
                System.out.println(Season.SPRING.getMonth());
                break;
            case SUMMER:
                System.out.println("June, Jule, August");
                break;
            case AUTUMN:
                System.out.println("September, October, November");
                break;
        }

    }
    public static void runMyProgram() {
        //logic
    }
*/
    }
}
