package com.softserve.edu07.pt;

public class Cleaner extends Staff{
    private static final String TYPE_PERSON = "Cleaner";
    public Cleaner(String name){
        super(name);
        System.out.println("Create a "+TYPE_PERSON+" by constructor Cleaner");
    }
    @Override
    public int salary() {
        return 8000;
    }
    public void print(){
        super.print();
        System.out.println("I'm a "+TYPE_PERSON);
    }
}
