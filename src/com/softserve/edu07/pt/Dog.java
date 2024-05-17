package com.softserve.edu07.pt;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof woof woof");
    }

    @Override
    public void feed() {
        System.out.println("I'm a dog and I'm hungry!");
    }
}
