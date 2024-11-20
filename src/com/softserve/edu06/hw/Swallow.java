package com.softserve.edu06.hw;

public class Swallow extends FlyingBird{

    public Swallow() {
        super();
    }

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Shallow can fly");

    }


}
