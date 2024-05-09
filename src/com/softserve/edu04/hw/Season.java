package com.softserve.edu04.hw;

public enum Season {
    AUTUMN("First semester"),
    WINTER("Period of winter exams"),
    SPRING("Second semester"),
    SUMMER("Vacation period");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
