package com.softserve.edu07.pt;

public abstract class Person {// Why you lose spaces bet-wine methods
    private String name;

    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void print();
}
