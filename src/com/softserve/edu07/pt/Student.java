package com.softserve.edu07.pt;

public class Student extends Person{
    private static final String TYPE_PERSON = "Student";
    public Student(String name){
        super(name);
        System.out.println("Create a "+TYPE_PERSON+" by constructor Student");
    }
    @Override
    public void print() {

        System.out.println("My name is "+getName()+"\nI'm a "+TYPE_PERSON);
    }
}
