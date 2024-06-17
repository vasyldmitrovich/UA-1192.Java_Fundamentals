package com.softserve.edu07.pt.pt2;

public class Teacher extends Staff {
    private final String position = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 1000;
    }

    @Override
    public void print() {
        System.out.println("Position " + position);

    }
}
