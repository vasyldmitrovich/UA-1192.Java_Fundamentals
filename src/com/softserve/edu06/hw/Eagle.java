package com.softserve.edu06.hw;

public class Eagle extends FlyingBird{

    public Eagle() {
        super();
    }

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly");

    }

}
