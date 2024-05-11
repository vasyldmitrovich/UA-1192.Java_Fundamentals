package com.softserve.edu04.hwork;

public enum Season {
    WINTER("Winter exams"),
    SPRING("The vacation period"),
    SUMMER("The second semester"),
    AUTUMN("The first semester");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}



