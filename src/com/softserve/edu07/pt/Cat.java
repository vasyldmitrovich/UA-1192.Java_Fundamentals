package com.softserve.edu07.pt;

import java.sql.SQLOutput;

public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("Meow meow!");
    }

    @Override
    public void feed() {
        System.out.println("The cat eats its meal!");
    }
}
