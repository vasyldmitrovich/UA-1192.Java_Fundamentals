package com.softserve.edu07.pt.animals;

import com.softserve.edu07.pt.animals.Animal;

public class Cat implements Animal {

    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("Meow");

    }

    @Override
    public void feed() {
        System.out.println("Cat eat Wiskas");

    }
}
