package com.softserve.edu07_oop2;

public class MyType implements Comparable {
    String name;

    public int compareTo(Object obj) {
        return name.compareTo(((MyType) obj).name);
    }
}
