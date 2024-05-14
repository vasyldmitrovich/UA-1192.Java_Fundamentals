package com.softserve.edu06.hw;

public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super("brown", true);
    }


    @Override
    public void fly() {
        super.fly();
        System.out.println("Kiwi cannot fly!");
    }
}
