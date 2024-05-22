package com.softserve.edu06.hw.homework1;

public class Kiwi extends NonFlyingBird{

    private String breed;

    public Kiwi () {
        super(true, true, 30);
        this.breed = "Brown Kiwi";
    }

    public Kiwi (boolean feathers, boolean layEggs, int movementSpeed, String breed) {
        super(feathers, layEggs, movementSpeed);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "breed='" + breed + '\'' +
                ", movement speed=" + movementSpeed +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
