package com.softserve.edu06.hw.bird;

public class Penguin extends NonFlyingBird {

    //some fields

    public Penguin() {
        super(false, true);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("It's penguin");
    }

}
