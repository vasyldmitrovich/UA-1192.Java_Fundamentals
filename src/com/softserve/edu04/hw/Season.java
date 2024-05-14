package com.softserve.edu04.hw;

public enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    public final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPeriodData(String Name) {

        if (Name == WINTER.name) {
            return "Winter exams";
        } else if (Name == SPRING.name){
            return "Second semester";
        } else if (Name == SUMMER.name) {
            return "Vacation";
        } else if (Name == AUTUMN.name) {
            return "First semester";
        } else {
            return "";
        }

    }


}
