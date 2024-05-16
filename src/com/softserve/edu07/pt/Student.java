package com.softserve.edu07.pt;

public class Student extends Person {
    private static final String TYPE_PERSON = "student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("My name is " + getName());
        System.out.println("I am a " + TYPE_PERSON);
    }
}
