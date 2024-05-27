package com.softserve.academy.edu07.pt.task_2;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";// This is architecture error. Person and Student have field with the same name. THIS IS BAD

    public Student(String name) {
        super(name);
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a Student");
    }
}
