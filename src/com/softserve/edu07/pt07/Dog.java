package com.softserve.edu07.pt07;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + name + " the dog...");
    }
}
