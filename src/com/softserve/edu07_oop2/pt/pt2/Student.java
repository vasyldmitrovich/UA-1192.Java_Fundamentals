package com.softserve.edu07_oop2.pt.pt2;

public class Student extends Person {
    static final String TYPE_PERSON = "Student";

    // Constructor
    Student(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    // Implementing abstract method print()
    @Override
    String print() {
        return "I am a student.";
    }
}
