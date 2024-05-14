package com.softserve.edu06.hw;

public class Eagle extends FlyingBird {

    public Eagle() {
        super("brown/white/black", true);
    }


    @Override
    public void fly() {
        super.fly();
        System.out.println("Eagle flies!");
    }
}
