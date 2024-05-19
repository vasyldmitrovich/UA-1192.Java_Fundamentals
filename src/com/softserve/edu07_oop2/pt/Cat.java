package com.softserve.edu07_oop2.pt;

public class Cat implements Animal{

    @Override
    public void feed() {
        System.out.println("The cat is hungry ");

    }

    @Override
    public void voice() {
        System.out.println("kis kis");
    }
}
