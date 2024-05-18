package com.softserve.edu06_oop1.hw01;

public class Eagle extends FlyingBird {


    public Eagle() {
        super(true, true);
    }

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flied bird");
    }
}
