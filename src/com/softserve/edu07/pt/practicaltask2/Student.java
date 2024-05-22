package com.softserve.edu07.pt.practicaltask2;

public class Student extends Person{

    final String TYPE_PERSON = "Student";

    public Student() {
        this.name = "Ivan";
        System.out.println(TYPE_PERSON);
    }

    public Student(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTYPE_PERSON() + ". My name is " + this.name);
    }
}
