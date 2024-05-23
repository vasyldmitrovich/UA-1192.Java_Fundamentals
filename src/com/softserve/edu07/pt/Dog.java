package com.softserve.edu07.pt;

public class Dog implements Animal {


    @Override
    public String voice() {
        return "Dog barks";
    }

    @Override
    public String feed() {
        return "Dog eats meat";
    }
}
