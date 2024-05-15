package com.softserve.edu04.hw;

import java.util.Scanner;

public class hw5 {// Name of class should start from Uppercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of the Labrador:");
        String name1 = scanner.nextLine();
        System.out.println("Enter age:");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name of the Golden Retriever:");
        String name2 = scanner.nextLine();
        System.out.println("Enter age:");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name of the Boxer:");
        String name3 = scanner.nextLine();
        System.out.println("Enter age:");
        int age3 = scanner.nextInt();
        scanner.nextLine();

        Dog dog1 = new Dog(name1, Breed.LABRADOR, age1);
        Dog dog2 = new Dog(name2, Breed.GOLDEN_RETRIEVER, age2);
        Dog dog3 = new Dog(name3, Breed.BOXER, age3);

        if (!hasDuplicateNames(dog1, dog2, dog3)) {
            Dog oldestDog = findOldestDog(dog1, dog2, dog3);
            System.out.println("Oldest dog: " + oldestDog.getName());
            System.out.println("Breed: " + oldestDog.getBreed());
        } else {
            System.out.println("Two or more dogs have the same name.");
        }
    }

    public static boolean hasDuplicateNames(Dog dog1, Dog dog2, Dog dog3) {
        return (dog1.getName().equals(dog2.getName()) ||
                dog1.getName().equals(dog3.getName()) ||
                dog2.getName().equals(dog3.getName()));
    }

    public static Dog findOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }
        return oldestDog;
    }
}
