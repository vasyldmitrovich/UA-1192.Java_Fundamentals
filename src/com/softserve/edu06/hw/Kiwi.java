package com.softserve.edu06.hw;

public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super(true, true);
    }

    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi can't fly");
    }

}
