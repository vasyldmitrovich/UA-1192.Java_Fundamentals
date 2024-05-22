package com.softserve.edu07.pt.practicaltask2;

public abstract class Staff extends Person{


    Staff () {
        this.name = "Ivan";
    }

    Staff (String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("I am a "+ this.name);
    }

    public abstract void salary();
}
