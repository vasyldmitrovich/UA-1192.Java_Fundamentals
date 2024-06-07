package com.softserve.edu07_oop2.pt;

public class Teacher extends Staff {

    public Teacher(String name) {
        super(name);
    }

    private final String TYPE_PERSON = "Teacher";

    @Override
    public void print() {
        System.out.println(this);

        System.out.println("This person is " + TYPE_PERSON);

    }

    @Override
    public int salary() {
        return  18_000;
    }
}
