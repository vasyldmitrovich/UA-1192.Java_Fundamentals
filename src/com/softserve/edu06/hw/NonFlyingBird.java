package com.softserve.edu06.hw;

public class NonFlyingBird extends Bird{// This class should not be abstract

    public NonFlyingBird() {
        super();
    }

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {

    }
}
