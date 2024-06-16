package com.softserve.edu06.hw.hw1;

public class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("Brown feathers", true);
    }

    @Override
    public void flay() {
        System.out.println(getClass().getSimpleName() + " cannot fly");

    }
}
