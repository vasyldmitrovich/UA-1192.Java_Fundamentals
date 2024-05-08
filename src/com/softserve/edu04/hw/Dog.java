package com.softserve.edu04.hw;

import java.io.InputStream;
import java.util.Scanner;

public class Dog {

    private String name;
    private int age;
    private Breed breed;

    // Move this and next three methods to App.java file not here
    public static Dog input(InputStream inputStream) {
        Scanner sc = new Scanner(inputStream);
        System.out.print("Input dog's name: ");
        String name = sc.nextLine();
        System.out.print("Input dog's age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Input dog's breed: ");
        Breed breed;
        do {
            breed = Breed.of(sc.nextLine());
            if (breed == null) {
                System.out.print("Invalid breed. Try again: ");
            }
        } while (breed == null);

        return new Dog(name, age, breed);
    }

    public static Dog getOldest(Dog... dogs) {
        Dog oldest = dogs[0];
        for (Dog dog : dogs) {
            if (dog.age > oldest.age) {
                oldest = dog;
            }
        }
        return oldest;
    }

    public static boolean allHasDiffName(Dog... dogs) {
        String[] names = dogsToNames(dogs);
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String[] dogsToNames(Dog[] dogs) {
        String[] names = new String[dogs.length];
        for (int i = 0; i < dogs.length; i++) {
            names[i] = dogs[i].getName();
        }
        return names;
    }

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = Math.abs(age);
        this.breed = breed;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
}
