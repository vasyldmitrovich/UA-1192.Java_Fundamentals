package com.softserve.edu07.pt.entity.t2;

public abstract class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    public abstract void salary();

    @Override
    public void print() {
        System.out.println("I am a stuff");
    }
}
