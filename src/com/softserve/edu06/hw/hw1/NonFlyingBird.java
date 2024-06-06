package com.softserve.edu06.hw.hw1;

public abstract class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println((getClass().getSimpleName() + " cannot fly"));

    }


}