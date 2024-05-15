package com.softserve.edu07.pt.job;

public class Student extends Person {

    public static final PersonType TYPE_PERSON = PersonType.STUDENT;

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        sayIAm();
        //we can move it to abstract or even inside enum method
        System.out.println(TYPE_PERSON.getType());
    }

}
