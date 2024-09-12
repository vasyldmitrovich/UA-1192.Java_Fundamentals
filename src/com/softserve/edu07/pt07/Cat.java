package com.softserve.edu07.pt07;


public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + name + " the cat...");
    }
}
