package com.softserve.edu04.hw;

public class Dog {
    public enum Breed {// Move to file Breed.java, not here
        AKITA, BULLDOG, BEAGLE, LABRADOR, BOXER, Chihuahua;
    }
    private String name;
    private Breed breed;
    private int age;

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

    private static Dog getAgeOfDog(Dog dog1, Dog dog2, Dog dog3) {// Move this method to file for example App.java not here
        Dog oldestDog = dog1;
        int ageOfOldestDog = Math.max(dog1.age, Math.max(dog2.age, dog3.age));
        if (ageOfOldestDog == dog1.getAge()){
            oldestDog = dog1;
        } if (ageOfOldestDog == dog2.getAge()){
            oldestDog = dog2;
        } if (ageOfOldestDog == dog3.getAge()){
            oldestDog = dog3;
        } return oldestDog;
    }

    public static void main (String[] args) {// Move to file App.java not here
        Dog dog1 = new Dog("Jessie", Breed.BEAGLE, 5);
        Dog dog2 = new Dog("Lucky", Breed.BULLDOG, 3);
        Dog dog3 = new Dog("Jordan", Breed.LABRADOR, 8);
        Dog oldestDog = getAgeOfDog(dog1, dog2, dog3);

        if(dog1.getName() != dog2.getName() && dog1.getName() != dog3.getName() && dog2.getName() != dog3.getName()) {
            System.out.println("Name of the oldest dog is: " + oldestDog.getName());
            System.out.println("Breed of the oldest dog is: " + oldestDog.getBreed());
        }
    }
}
