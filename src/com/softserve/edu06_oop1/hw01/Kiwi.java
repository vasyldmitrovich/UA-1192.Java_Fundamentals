package com.softserve.edu06_oop1.hw01;

public class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super(true, true);
    }

    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi is not flied bird");
    }
}
