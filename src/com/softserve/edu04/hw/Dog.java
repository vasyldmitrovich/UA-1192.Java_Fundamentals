package com.softserve.edu04.hw;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog() {

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
        return  breed;
    }

    public int getAge() {
        return age;
    }

    // Add setters and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        if (age != dog.age) return false;
        return name.equals(dog.name);
    }

    @Override
    public String toString() {
        return "dog name: " + name + '\n' +
                "dog breed: " + breed + "\n" +
                "dog age: " + age + "\n";
    }
}

