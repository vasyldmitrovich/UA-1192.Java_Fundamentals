package com.softserve.edu04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public enum Breed {
        LABRADOR,
        GERMAN_SHEPHERD,
        GOLDEN_RETRIEVER,
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", Breed.LABRADOR, 5);
        Dog dog2 = new Dog("Max", Breed.GERMAN_SHEPHERD, 3);
        Dog dog3 = new Dog("Rody", Breed.GOLDEN_RETRIEVER, 7); // Duplicate name for testing

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        Set<String> names = new HashSet<>();
        boolean hasDuplicates = false;
        for (Dog dog : dogs) {
            if (!names.add(dog.getName())) {
                hasDuplicates = true;
                break;
            }
        }

        if (hasDuplicates) {
            System.out.println("Error: There are two or more dogs with the same name.");
        } else {

            Dog oldestDog = dogs.get(0);
            for (Dog dog : dogs) {
                if (dog.getAge() > oldestDog.getAge()) {
                    oldestDog = dog;
                }
            }

            System.out.println("The oldest dog is " + oldestDog.getName() + " of breed " + oldestDog.getBreed());
        }
    }
}