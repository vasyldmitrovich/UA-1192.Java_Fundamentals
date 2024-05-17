package com.softserve.edu07.pt;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Meow meow meow");
    }

    @Override
    public void feed() {
        System.out.println("I'm a cat and I'm hungry!");
    }
}
