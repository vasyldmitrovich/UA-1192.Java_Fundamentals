package com.softserve.edu07.pt;

public class Teacher extends Staff{
    private String TYPE_PERSON = "Teacher";


    public Teacher(String name){
        super(name);
        System.out.println("A new " + TYPE_PERSON + " created");
    }

    @Override
    public String salary() {
        return "I have average salary";
    }

    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }
}
