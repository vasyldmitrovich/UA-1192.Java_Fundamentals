package com.softserve.edu06.hw.bird;

public abstract class NonFlyingBird extends Bird {

    //some fields

    public NonFlyingBird() {
    }

    public NonFlyingBird(boolean hasFeathers, boolean canLayEggs) {
        super(hasFeathers, canLayEggs);
    }

    @Override
    public void fly() {
        System.out.print("Non flying bird: ");
    }

}
