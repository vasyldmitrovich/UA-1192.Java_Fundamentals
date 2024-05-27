package com.softserve.edu07.ptask;

public class Student extends Person {
    private final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }


}
