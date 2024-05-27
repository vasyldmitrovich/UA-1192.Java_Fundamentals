package com.softserve.edu07.ptask;

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("The dog eats its bone");
    }
}
