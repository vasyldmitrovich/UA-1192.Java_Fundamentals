package com.softserve.edu07.pt.pt1;

public class Cat implements Animal{
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("omnomnom mrrrr");
    }
}
