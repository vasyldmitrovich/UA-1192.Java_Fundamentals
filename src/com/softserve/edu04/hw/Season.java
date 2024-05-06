package com.softserve.edu04.hw;

public enum Season {
    WINTER("Winter", "Winter Exams"),
    SPRING("Spring", "Second Semester"),
    SUMMER("Summer", "Vacation"),
    AUTUMN("Autumn", "First Semester");

    private final String name;
    private final String graduationActivity;

    public static Season of(String season) {
        try {
            return valueOf(season.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    Season(String name, String graduationActivity) {
        this.name = name;
        this.graduationActivity = graduationActivity;
    }

    public String getName() {
        return name;
    }

    public String getGraduationActivity() {
        return graduationActivity;
    }
}
