package com.softserve.edu04.pt;

public class Dog {// USE CODE REFACTOR  because this code is not readable
    private String name;
    private Breed breed;
    private int age;

    public enum Breed{// Move to file Breed.java
        LABRADOR, SHEPHERD, BULDOG, BEAGLE

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
    public static void main(String[] args) {// Move to App.java
        Dog dog1 = new Dog("Jecky", Breed.SHEPHERD, 5);
        Dog dog2 = new Dog("Jecky", Breed.BULDOG, 7);
        Dog dog3 = new Dog("John", Breed.BEAGLE, 2);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName()))
        {
            System.out.println("thare is dogs with same name.");
        } else {
            System.out.println("thare is not dogs with same name.");
        }

        // Знаходимо найстарішу собаку
        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }

        System.out.println("name and breed the oldest dog:");
        System.out.println("name: " + oldestDog.getName());
        System.out.println("breed: " + oldestDog.getBreed());
    }
}


