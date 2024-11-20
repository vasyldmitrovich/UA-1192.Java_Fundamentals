package com.softserve.edu07_oop2.exampleInterface;

//slide 12
public abstract class Shape {

    protected String name;

    public Shape(String name) {
    }

    /* because this is an abstract method the body will be blank */
    public abstract double getArea();
}
