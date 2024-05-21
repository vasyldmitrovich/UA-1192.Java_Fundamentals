package com.softserve.edu07.pt.entity.t2;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a student");
    }
}
