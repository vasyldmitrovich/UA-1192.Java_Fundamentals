package com.softserve.academy.edu07.pt.task_1;

public class Cat implements Animal
{

    /**
     *
     */
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    /**
     *
     */
    @Override
    public void feed() {
        System.out.println("Cat is eating");
    }
}
