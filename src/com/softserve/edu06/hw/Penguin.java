package com.softserve.edu06.hw;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        super(false, true);
    }

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Penguin can't fly");
    }

}