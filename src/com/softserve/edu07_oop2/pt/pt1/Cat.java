package com.softserve.edu07_oop2.pt.pt1;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "Meow!"; // Cat's sound
    }

    @Override
    public String feed() {
        return "Feeding cat..."; // Feed the cat
    }
}
