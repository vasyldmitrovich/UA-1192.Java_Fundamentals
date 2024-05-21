package com.softserve.edu07.pt.entity.t1;

import com.softserve.edu07.pt.intf.Animal;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("I eat fish");
    }
}
