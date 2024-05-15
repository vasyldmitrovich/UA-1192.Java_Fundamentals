package com.softserve.edu06_oop1.Inher;

public abstract class Base {
    private int k;

    public Base() {
        k = 123;
        System.out.println("constructor Base()");
    }

    public abstract int getI();
}
