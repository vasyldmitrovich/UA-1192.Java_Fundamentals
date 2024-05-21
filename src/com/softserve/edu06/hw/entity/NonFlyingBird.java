package com.softserve.edu06.hw.entity;


public abstract class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " cannot fly.");
    }
}