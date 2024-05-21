package com.softserve.edu06.hw.entity;

public abstract class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying.");
    }
}