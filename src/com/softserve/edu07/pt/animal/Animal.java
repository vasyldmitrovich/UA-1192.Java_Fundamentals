package com.softserve.edu07.pt.animal;

public interface Animal {

    void voice();

    void feed(String food);

    default void smell() {
        System.out.println("Smell...");
    }

}
