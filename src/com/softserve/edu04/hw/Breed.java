package com.softserve.edu04.hw;

public enum Breed {
    AKITA("Akita"),
    ALASKAN_MALAMUTE("American malamute"),
    AMERICAN_BULLDOG("American bulldog");

    private final String name;

    Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
