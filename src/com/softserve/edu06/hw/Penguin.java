package com.softserve.edu06.hw;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        super("black/white", true);
    }


    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguin cannot fly!");

    }
}
