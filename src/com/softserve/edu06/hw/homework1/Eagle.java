package com.softserve.edu06.hw.homework1;

public class Eagle extends FlyingBird{

    private String breed;

    public Eagle () {
        super(true, true, 120);
        this.breed = "Bald Eagle";
    }

    public Eagle (boolean feathers, boolean layEggs, int flyingSpeed, String breed) {
        super(feathers, layEggs, flyingSpeed);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "breed='" + breed + '\'' +
                ", flightSpeed=" + flightSpeed +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
