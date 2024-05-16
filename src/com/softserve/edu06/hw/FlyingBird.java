package com.softserve.edu06.hw;

public class FlyingBird extends Bird {// Good

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }


    @Override
    public void fly() {
        System.out.println("It`s flying bird!");
    }
}
