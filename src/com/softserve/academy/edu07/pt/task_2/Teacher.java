package com.softserve.academy.edu07.pt.task_2;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Teacher");
    }

    @Override
    public double salary() {
        return 5000.00; // Example salary
    }
}