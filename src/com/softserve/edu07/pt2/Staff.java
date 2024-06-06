package com.softserve.edu07.pt2;

public abstract class Staff extends Person {


    Staff(String name) {
        super(name);
        System.out.println("I am a " + TYPE_PERSON);

    }

    @Override
    public int salary() {
        return 0;
    }


    @Override
    public void print() {

    }
}
