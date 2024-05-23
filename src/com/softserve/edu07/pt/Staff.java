package com.softserve.edu07.pt;

public abstract class Staff extends Person{

    public Staff(String name){
        super(name);
    }

    public abstract String salary();
}
