package com.softserve.edu04.hw;

enum Season {
    WINTER("Exam period"), SPRING("Second semester"), SUMMER("The vacation period"), AUTUMN("First semester");
    private String period;

    Season(String period) {
        this.period = period;
    }

    public String getPeriod() {
        return period;
    }
}
