package com.softserve.edu07_oop2.pt;

public class Student extends Person {

    private final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this);

        System.out.println("This person is " + TYPE_PERSON);

    }


}
