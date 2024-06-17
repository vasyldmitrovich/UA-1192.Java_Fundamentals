package com.softserve.edu07.pt.pt1;

public class Dog implements Animal {
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("omnomnom");
    }
}
