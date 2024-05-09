package com.softserve.edu04.hw;

public class Dog {
    public String name;
    public int age;
    public Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "The oldest dog" +
                "name='" + name + '\'' +
                ", breed=" + getBreed();
    }
}
