package com.softserve.edu04.HW.hw4.Enum;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed=breed;

    }
    public void setAge(int age){
        this.age=age;
    }
    public enum Breed {// Move to file Breed.java not here
        LABRADOR,
        PUG,
        BULLDOG
    }
}
