package com.softserve.edu04.hw;

import java.util.Objects;

public class Dog {
/*
    Create a class called Dog that has the following fields: name, breed, age.
    • Declare enum for field breed.
    • In main() method create three instances of type Dog.
    o Check if there are no two dogs with the same name;
    o Output the name and the breed of the oldest dog.
 */
    private String name;
    private Breed breed;
    private int age;

    public Dog(){}

    public Dog(String name, Breed breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }
}

enum Breed{
    GERMAN_SHEPHERD, GOLDEN_RETRIEVER, PIT_BULL, LABRADOR, CHIHUAHUA

}
