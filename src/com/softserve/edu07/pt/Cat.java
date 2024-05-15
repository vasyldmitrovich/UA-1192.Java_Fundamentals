package com.softserve.edu07.pt;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("The cat meows");
    }

    @Override
    public void feed() {
        System.out.println("The cat is eating");
    }
}
