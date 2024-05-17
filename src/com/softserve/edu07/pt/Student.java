package com.softserve.edu07.pt;

public class Student extends Person {

    private final String TYPE_PERSON = "Student";

    public Student() {
        System.out.println(this.TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a student");
    }
}
