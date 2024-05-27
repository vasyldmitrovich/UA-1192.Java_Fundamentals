package com.softserve.edu07.ptask;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 1000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);

    }
}
