package com.softserve.edu06_oop1.hw.hw1;


public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super("Brown", true);
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
