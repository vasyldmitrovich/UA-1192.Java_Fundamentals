package com.softserve.edu06.hw.Homework1;

public class Swallow extends FlyingBird {

    private String breed;

    public Swallow () {
        super(true, true, 32);
        this.breed = "Barn Swallow";
    }

    public Swallow (boolean feathers, boolean layEggs, int flyingSpeed, String breed) {
        super(feathers, layEggs, flyingSpeed);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "breed='" + breed + '\'' +
                ", flightSpeed=" + flightSpeed +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
