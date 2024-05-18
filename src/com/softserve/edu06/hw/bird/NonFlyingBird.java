package com.softserve.edu06.hw.bird;

public abstract class NonFlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("This bird can't fly");
    }
}
