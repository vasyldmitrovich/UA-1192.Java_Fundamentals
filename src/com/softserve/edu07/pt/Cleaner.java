package com.softserve.edu07.pt;

public class Cleaner extends Staff{
    private String TYPE_PERSON = "Cleaner";

    public Cleaner(String name){
        super(name);
        System.out.println("A new " + TYPE_PERSON + " created");
    }


    @Override
    public String salary() {
        return "I have low salary";
    }

    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }
}
