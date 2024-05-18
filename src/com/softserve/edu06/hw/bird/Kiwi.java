package com.softserve.edu06.hw.bird;

public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        setFeathers(false);
        setLayEggs(true);
    }

    @Override
    public String toString() {
        return "Kiwi:\n has feathers:" + isFeathers() +
                "\n can lay eggs:" + isLayEggs();
    }
}
