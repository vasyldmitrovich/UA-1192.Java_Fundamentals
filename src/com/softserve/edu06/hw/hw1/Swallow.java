package com.softserve.edu06.hw.hw1;

public class Swallow extends FlyingBird {
    public Swallow() {
        super("Small feathers", true);

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying gracefully");

    }
}
