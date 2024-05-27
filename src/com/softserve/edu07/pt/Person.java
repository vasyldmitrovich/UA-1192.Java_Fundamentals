package com.softserve.edu07.pt;

public abstract class Person {
    String name;// Make private and add setter

    public Person(String name){
        this.name = name;
    }

    public abstract String print();

}
