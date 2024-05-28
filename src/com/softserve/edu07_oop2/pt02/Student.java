package com.softserve.edu07_oop2.pt02;

class Student extends Person {
    final String TYPE_PERSON = "Student"; //constant


    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);

    }
}
