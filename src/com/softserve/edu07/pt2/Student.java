package com.softserve.edu07.pt2;

public class Student extends Person {

    static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println("I am a:" + TYPE_PERSON);

    }

    @Override
    int salary() {
        return 0;
    }


    @Override
    public void print() {

    }
}

