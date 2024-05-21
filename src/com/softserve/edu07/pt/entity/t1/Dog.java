package com.softserve.edu07.pt.entity.t1;


import com.softserve.edu07.pt.intf.Animal;

public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("I eat meat");
    }
}

