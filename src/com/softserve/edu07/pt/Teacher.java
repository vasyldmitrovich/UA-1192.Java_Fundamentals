package com.softserve.edu07.pt;

public class Teacher extends Staff {

    private static final String TYPE_PERSON = "teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 10000;
    }

    @Override
    public void print() {
        System.out.println("My name is " + getName());
        System.out.println("I am a " + TYPE_PERSON);
    }
}
