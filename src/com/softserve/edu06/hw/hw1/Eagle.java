package com.softserve.edu06.hw.hw1;

public class Eagle extends FlyingBird {

    public Eagle() {

        super("grey and white", true);
    }

    @Override

    public void fly() {
        System.out.println(getClass().getSimpleName() + " soars high in the sky");
    }


}