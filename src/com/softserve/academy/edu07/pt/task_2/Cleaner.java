package com.softserve.academy.edu07.pt.task_2;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Cleaner");
    }

    @Override
    public double salary() {
        return 2000.00; // Example salary
    }
}
