package com.softserve.edu07.pt.job;

public abstract class Person {

    protected String name;

    protected Person(String name) {
        this.name = name;
    }

    public abstract void print();

    protected void sayIAm() {
        System.out.print("I am a ");
    }

}
