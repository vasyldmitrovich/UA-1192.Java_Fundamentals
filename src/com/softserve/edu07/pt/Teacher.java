package com.softserve.edu07.pt;

public class Teacher extends Staff {

    private final String TYPE_PERSON = "Teacher";

    public Teacher() {
        System.out.println(this.TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a teacher");
    }

    @Override
    public void salary() {
        System.out.println("Issue a teacher's salary");
    }

}
