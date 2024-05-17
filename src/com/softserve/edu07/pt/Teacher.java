package com.softserve.edu07.pt;

public class Teacher extends Staff{
    private static final String TYPE_PERSON = "Teacher";
    public Teacher(String name){
        super(name);
        System.out.println("Create a "+TYPE_PERSON+" by constructor Teacher");
    }
    @Override
    public int salary() {
        return 10000;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("I'm a "+TYPE_PERSON);
    }
}
