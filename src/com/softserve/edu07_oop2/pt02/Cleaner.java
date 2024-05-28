package com.softserve.edu07_oop2.pt02;

class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner"; //constant

    public Cleaner(String name) {
        super(name);
    }

    @Override
    int salary() {
        return 5_000;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);

    }
}
