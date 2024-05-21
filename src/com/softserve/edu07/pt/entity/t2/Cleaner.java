package com.softserve.edu07.pt.entity.t2;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("I have cleaner salary");
    }
}
