package com.softserve.edu07.pt.animals;

import com.softserve.edu07.pt.animals.Animal;

public class Dog implements Animal {

    public Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void feed() {
        System.out.println("Dog eat Pedigree");
    }
}
