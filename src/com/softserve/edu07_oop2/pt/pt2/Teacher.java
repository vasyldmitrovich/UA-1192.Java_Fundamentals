package com.softserve.edu07_oop2.pt.pt2;

public class Teacher extends Person {
    static final String TYPE_PERSON = "Teacher";

    // Constructor
    Teacher(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    // Implementing abstract method print()
    @Override
    String print() {
        return "I am a teacher.";
    }
}


