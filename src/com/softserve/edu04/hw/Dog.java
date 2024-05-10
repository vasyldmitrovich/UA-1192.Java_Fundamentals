package com.softserve.edu04.hw;

public class Dog {

    private String name;
    private int age;
    private Breed breed;

    public Dog() {
        this.name = "";
        this.age = 0;
        this.breed = null;
    }

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

}
