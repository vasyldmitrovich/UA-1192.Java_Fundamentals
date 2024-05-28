package com.softserve.edu07_oop2.pt.pt1;

public class Dog implements Animal {
    @Override
    public String voice() {
        return "Woof!"; // Dog's sound
    }

    @Override
    public String feed() {
        return "Feeding dog..."; // Feed the dog
    }
}
