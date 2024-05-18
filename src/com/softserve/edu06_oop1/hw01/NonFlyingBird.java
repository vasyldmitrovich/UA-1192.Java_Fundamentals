package com.softserve.edu06_oop1.hw01;

public class NonFlyingBird extends Bird {
    public NonFlyingBird() {
        super();
    }

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
    }

}
