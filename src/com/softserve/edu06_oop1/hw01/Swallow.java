package com.softserve.edu06_oop1.hw01;

public class Swallow extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public Swallow() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flied bird");
    }

}
