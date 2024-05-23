package com.softserve.edu07.pt;

public class Student extends Person{
    private String TYPE_PERSON = "Student";

    public Student(String name){
        super(name);
        System.out.println("A new " + TYPE_PERSON + " created");
    }

    public String print(){
        return "I am a " + TYPE_PERSON;
    }
}
