package com.softserve.edu06.hw.homework1;

public class Penguin extends NonFlyingBird{

    private String breed;

    public Penguin () {
        super(true, true, 6);
        this.breed = "King Penguin";
    }

    public Penguin (boolean feathers, boolean layEggs, int movementSpeed, String breed) {
        super(feathers, layEggs, movementSpeed);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "breed='" + breed + '\'' +
                ", movement speed=" + movementSpeed +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
