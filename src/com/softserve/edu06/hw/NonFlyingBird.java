package com.softserve.edu06.hw;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }


    @Override
    public void fly() {
        System.out.println("It`s not flying bird!");
    }
}
