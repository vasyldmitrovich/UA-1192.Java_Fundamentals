package com.softserve.edu06.hw;

public class Swallow extends FlyingBird {

    public Swallow() {
        super("Blue/white", true);
    }


    @Override
    public void fly() {
        super.fly();
        System.out.println("Swallow flies!");
    }
}
