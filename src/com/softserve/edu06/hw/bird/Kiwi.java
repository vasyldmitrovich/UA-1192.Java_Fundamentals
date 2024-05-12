package com.softserve.edu06.hw.bird;

public class Kiwi extends NonFlyingBird {

    //some fields

    @Override
    public void fly() {
        super.fly();
        System.out.println("It's kiwi");
    }

}
