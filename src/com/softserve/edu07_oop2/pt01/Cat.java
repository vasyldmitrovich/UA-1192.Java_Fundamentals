package com.softserve.edu07_oop2.pt01;

class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("The cat says 'Meow' ");

    }

    @Override
    public void feed() {
        System.out.println("The cat eats 'Cat Chau' ");

    }

}
