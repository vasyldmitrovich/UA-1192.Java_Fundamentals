package com.softserve.edu04.hw;

public enum Breed {// Ok
    GERMAN_SHEPHERD,
    GOLDEN_RETRIEVER,
    PIT_BULL,
    LABRADOR_RETRIEVER;

    public static Breed of(String breed) {
        try {
            breed = breed.replace(' ', '_').toUpperCase();
            return valueOf(breed.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
