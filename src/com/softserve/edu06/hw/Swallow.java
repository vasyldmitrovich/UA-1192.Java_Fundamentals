package com.softserve.edu06.hw;

public class Swallow extends FlyingBird {

    public Swallow() {
        super(true, true);
    }

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallow flying");
    }

}
