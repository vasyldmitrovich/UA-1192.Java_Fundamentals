package com.softserve.edu06_oop1.hw.hw1;


public class Swallow extends FlyingBird {

    public Swallow() {
        super("Blue and white", true);
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
