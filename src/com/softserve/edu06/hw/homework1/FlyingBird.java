package com.softserve.edu06.hw.homework1;

public class FlyingBird extends Bird {

    protected int flightSpeed;


    FlyingBird () {
        super(true, true);
        this.flightSpeed = 60;
    }
    FlyingBird (boolean feathers, boolean layEggs, int flightSpeed) {
        super(feathers, layEggs);
        this.flightSpeed = flightSpeed;
    }

    @Override
    public void fly() {
        System.out.println("The bird flies at speed " + this.flightSpeed);
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "flightSpeed=" + flightSpeed +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
