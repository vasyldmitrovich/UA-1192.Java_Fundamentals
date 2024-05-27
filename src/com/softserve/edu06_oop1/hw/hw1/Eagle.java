package com.softserve.edu06_oop1.hw.hw1;

public class Eagle extends FlyingBird {

    public Eagle() {
        super("Dark brown", true);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
