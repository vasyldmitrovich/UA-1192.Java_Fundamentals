package com.softserve.academy.edu04.hw;


//5.* Create a class called Dog that has the following fields: name, breed, age.
//• Declare enum for field breed.
//            • In main() method create create three instances of type Dog.
//    o Check if there are no two dogs with the same name;
//    o Output the name and the breed of the oldest dog.

public class Dog {
    private String name;
    private BreedEnum breed;
    private int age;

    public Dog(String name, BreedEnum breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public BreedEnum getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
