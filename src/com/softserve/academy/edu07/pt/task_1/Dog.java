package com.softserve.academy.edu07.pt.task_1;

public class Dog implements Animal
{
    @Override
    public void voice() {
        System.out.println("Dog voice");
    }

    @Override
    public void feed() {
        System.out.println("Dog feed");
    }
}
