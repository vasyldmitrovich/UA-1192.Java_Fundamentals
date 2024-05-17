package com.softserve.edu07.pt;

public class Cleaner extends Staff {

    private final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
        System.out.println(this.TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner");
    }

    @Override
    public void salary() {
        System.out.println("Issue a cleaner's salary");
    }
}
