package com.softserve.edu07.pt.pt2;

public class Student extends Person {
    final String TYPE_PERSON = getClass().getSimpleName();

    public Student() {
    }

    public Student(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }


    @Override
    public void print() {
        System.out.println("I am a..." + TYPE_PERSON + " " + getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
