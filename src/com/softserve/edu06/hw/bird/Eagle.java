package com.softserve.edu06.hw.bird;

public class Eagle extends FlyingBird {

    public Eagle() {
        setFeathers(true);
        setLayEggs(true);
    }

    @Override
    public String toString() {
        return "Egle:\n has feathers:" + isFeathers() +
                "\n can lay eggs:" + isLayEggs();
    }
}
