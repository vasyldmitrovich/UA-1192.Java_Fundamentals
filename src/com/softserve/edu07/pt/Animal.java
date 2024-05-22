package com.softserve.edu07.pt;

interface Animal {
    void voice();

    void feed();
}

class Cat implements Animal {// ALL CLASSES SHOULD BE IN DIFFERENT FILES, NOT HERE IN ONE CLASS
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " (Cat) says: Meow!");
    }

    @Override
    public void feed() {
        System.out.println(name + " (Cat) is being fed with cat food.");
    }
}

class Dog implements Animal {
    private String name;// You already have in Animal class field like that

    public Dog(String name) {
        this.name = name;
    }// add another parameters

    @Override
    public void voice() {
        System.out.println(name + " (Dog) says: Woof!");
    }

    @Override
    public void feed() {
        System.out.println(name + " (Dog) is being fed with dog food.");
    }
}

class Main {// Move to App.java
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];


        animals[0] = new Cat("Whiskers");
        animals[1] = new Cat("Mittens");
        animals[2] = new Dog("Rover");
        animals[3] = new Dog("Fido");


        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}
