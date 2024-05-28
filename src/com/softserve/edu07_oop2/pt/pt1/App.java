package com.softserve.edu07_oop2.pt.pt1;

public class App {
    public static void main(String[] args) {
        // Create an array of Animal
        Animal[] animals = new Animal[4];

        // Adding cats and dogs to the array
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        // Call voice() and feed() method for all animals
        for (Animal animal : animals) {
            System.out.println(animal.voice());
            System.out.println(animal.feed());
        }
    }
}
