package com.softserve.edu07_oop2.pt.pt2;

public class Cleaner extends Staff {
    static final String TYPE_PERSON = "Cleaner";

    // Constructor
    Cleaner(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    // Implementing abstract method print()
    @Override
    String print() {
        return "I am a cleaner.";
    }

    // Implementing abstract method salary()
    @Override
    String salary() {
        return "Calculating salary for Cleaner: " + name;
    }
}
