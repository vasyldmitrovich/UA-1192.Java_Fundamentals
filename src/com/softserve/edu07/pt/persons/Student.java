package com.softserve.edu07.pt.persons;

public class Student extends Person {
    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println("Type of person " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I`m " + getName() + " " + TYPE_PERSON);
    }
}
