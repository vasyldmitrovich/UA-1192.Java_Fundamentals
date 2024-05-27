package com.softserve.edu07.ptask;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 800;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);

    }
}
