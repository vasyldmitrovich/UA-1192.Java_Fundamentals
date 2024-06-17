package com.softserve.edu07.pt.pt1;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
