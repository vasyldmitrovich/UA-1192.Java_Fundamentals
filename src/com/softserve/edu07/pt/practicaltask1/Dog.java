package com.softserve.edu07.pt.practicaltask1;

public class Dog implements Animal{

    private String name;
    private String breed;

    public Dog() {
        this.name = "Jacky";
        this.breed = "Bulldog";
    }

    public Dog(String name, String breed) {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Woof-woof");
    }

    @Override
    public void feed() {
        System.out.println("Dog eat shredded meat");
    }
}
