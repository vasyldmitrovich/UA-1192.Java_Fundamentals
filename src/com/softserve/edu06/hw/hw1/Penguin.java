package com.softserve.edu06.hw.hw1;

public class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Black and white feathers", true);
    }

    @Override
    public void flay() {
        System.out.println(getClass().getSimpleName() + " cannot fly");

    }

}



