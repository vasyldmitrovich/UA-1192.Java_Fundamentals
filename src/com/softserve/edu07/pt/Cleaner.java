package com.softserve.edu07.pt;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 8500;
    }

    @Override
    public void print() {
        System.out.println("My name is " + getName());
        System.out.println("I am a " + TYPE_PERSON);
    }


}
