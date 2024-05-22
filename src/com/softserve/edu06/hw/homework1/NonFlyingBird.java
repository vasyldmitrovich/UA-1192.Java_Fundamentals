package com.softserve.edu06.hw.homework1;

public class NonFlyingBird extends Bird{

    protected int movementSpeed;

    NonFlyingBird () {
        super(false, true);
        this.movementSpeed = 10;
    }

    NonFlyingBird (boolean feathers, boolean layEggs, int movementSpeed) {
        super(feathers, layEggs);
        this.movementSpeed = movementSpeed;
    }

    @Override
    public void fly() {
        System.out.println("The bird can't fly");
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "movementSpeed=" + movementSpeed +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
