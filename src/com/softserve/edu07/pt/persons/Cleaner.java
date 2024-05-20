package com.softserve.edu07.pt.persons;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Type of person " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I`m " + getName() + " " + TYPE_PERSON);

    }

    @Override
    public double salary() {
        return 15000.5;
    }
}
