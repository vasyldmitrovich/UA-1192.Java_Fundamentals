package com.softserve.edu06.hw.bird;

public abstract class FlyingBird extends Bird {// Good
    @Override
    public void fly() {
        System.out.println("This bird can fly");
    }
}
