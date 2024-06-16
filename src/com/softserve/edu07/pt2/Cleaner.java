package com.softserve.edu07.pt2;

public  class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public int salary() {
        System.out.println("I am a " + TYPE_PERSON);
        return 10000;
    }
}