package com.softserve.edu07_oop2.pt;

public class Dog implements Animal{

    @Override
    public void feed() {
        System.out.println("The dog eats meat");
    }

    @Override
    public void voice() {
        System.out.println("Bow-wow");
    }
}
