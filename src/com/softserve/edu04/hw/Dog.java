package com.softserve.edu04.hw;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog() {

    }

    public Dog(String name, Breed breed, int age) {
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

    public static void findOlderDog(Dog[] dog) {
        Dog oldestDog = dog[0];

        for (int i = 0; i < dog.length; i++) {
            if (oldestDog.getAge() < dog[i].getAge()) {
                oldestDog = dog[i];
            }
        }
        System.out.println("The oldest dog\n " + oldestDog.toString());
    }

    public static void findSameName(Dog[] dogs) {
        int check = 0;

        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if ((dogs[i].equals(dogs[j]))) {
                    System.out.println("We have dogs with the same name " + dogs[i].getName());
                    check++;
                }
            }
        }
        if (check == 0) {
            System.out.println("We haven't dogs with the same name ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

enum Breed {
    LABRADOR_RETRIEVER, BULLDOG, POODLE, MOPS, LABRADOR, HUSKY
}
