package com.softserve.edu06.hw.bird;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        setFeathers(false);
        setLayEggs(true);
    }

    @Override
    public String toString() {
        return "Penguin:\n has feathers:" + isFeathers() +
                "\n can lay eggs:" + isLayEggs();
    }
}
