package com.softserve.edu07.pt.pt2;

public class Student extends Person {
    private final String position = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Position " + position);
    }


}
