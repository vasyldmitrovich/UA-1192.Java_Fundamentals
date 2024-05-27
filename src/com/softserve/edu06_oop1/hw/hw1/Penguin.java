package com.softserve.edu06_oop1.hw.hw1;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        super("Black and white", true);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
