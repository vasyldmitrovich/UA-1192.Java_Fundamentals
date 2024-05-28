package com.softserve.edu07_oop2.pt02;

class Teacher extends Staff {
    final String TYPE_PERSON = "Teacher"; //constant

    public Teacher(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 10_000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);

    }
}
