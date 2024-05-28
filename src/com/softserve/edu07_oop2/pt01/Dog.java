package com.softserve.edu07_oop2.pt01;

class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("The dog says 'Woof' ");

    }

    @Override
    public void feed() {
        System.out.println("The dog eats 'Purina.Pro plan' ");

    }
}
