package com.softserve.edu04.hw;

public enum Breed {
    POODLE("Poodle"),
    SPANIEL("Spaniel"),
    TERRIER("Terrier");

    private final String breedName;

    Breed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }
}
