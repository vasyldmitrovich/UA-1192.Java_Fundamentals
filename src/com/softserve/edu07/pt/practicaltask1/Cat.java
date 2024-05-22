package com.softserve.edu07.pt.practicaltask1;

public class Cat implements Animal{

    private String name;
    private String breed;

    public Cat() {
        this.name = "Cookie";
        this.breed = "Birman";
    }

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Meow-meow");
    }

    @Override
    public void feed() {
        System.out.println("Cat eat fish");
    }
}
