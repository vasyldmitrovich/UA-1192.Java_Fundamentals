package com.softserve.edu07.pt;

public class Cat implements Animal{


    @Override
    public String voice() {
        return "Cat meows";
    }

    @Override
    public String feed() {
        return "Cat eats fish";
    }
}
