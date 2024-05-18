package com.softserve.edu06.hw.bird;

public class Swallow extends FlyingBird {

    public Swallow() {
        setFeathers(true);
        setLayEggs(true);
    }

    @Override
    public String toString() {
        return "Swallow:\n has feathers:" + isFeathers() +
                "\n can lay eggs:" + isLayEggs();
    }
}
