package com.softserve.edu04.hw;

import java.util.Scanner;

public class Faculty {
    private String season;
    private int studentsQuantity;

    public Faculty(){
    }

    public Faculty(String season, int studentsQuantity){
        this.season = season;
        this.studentsQuantity = studentsQuantity;
    }

    public Faculty(String season, int studentsQuantity, String description){
        this.season = season;
        this.studentsQuantity = studentsQuantity;
    }

    // Add getters and setters because you never use this field this is not good

    public static void getSeason(){// This method move to App class
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput students quantity, please: ");
        String inputQuantity = scanner.nextLine();
        System.out.println("\nInput the study season, please: ");
        String inputSeason = scanner.nextLine();
        switch (inputSeason.toLowerCase()){
            case "winter" -> Season.Winter.showme();
            case "spring" -> Season.Spring.showme();
            case "summer" -> Season.Summer.showme();
            case "autumn" -> Season.Autumn.showme();
            default ->  System.out.println("No season with same name, try again please.");
        }
    }
}
