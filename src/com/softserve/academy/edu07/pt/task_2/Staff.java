package com.softserve.academy.edu07.pt.task_2;

public abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    public abstract double salary();
}
