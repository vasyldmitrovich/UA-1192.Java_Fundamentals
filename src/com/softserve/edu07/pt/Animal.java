package com.softserve.edu07.pt;

interface Animal {
    void voice();

    void feed();
}

class Cat implements Animal {
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
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(name + " (Dog) says: Woof!");
    }

    @Override
    public void feed() {
        System.out.println(name + " (Dog) is being fed with dog food.");
    }
}

class Main {
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
