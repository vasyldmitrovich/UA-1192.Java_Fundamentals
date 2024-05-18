package com.softserve.edu06_oop1.hw01;

public class Penguin extends NonFlyingBird {
    public Penguin() {
        super(false, true);
    }

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Penguin is not flied bird");
    }

}
