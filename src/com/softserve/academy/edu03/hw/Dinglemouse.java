package com.softserve.academy.edu03.hw;

public class Dinglemouse {

    private static int ONE_HUNDRED = 100;

    private final int value;

    public final static Dinglemouse INST = new Dinglemouse();

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}