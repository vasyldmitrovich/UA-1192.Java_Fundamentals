package com.softserve.edu07.pt.entity.t2;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("I have teachers salary");
    }
}
