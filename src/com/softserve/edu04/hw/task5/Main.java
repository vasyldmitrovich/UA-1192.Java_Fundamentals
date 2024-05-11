package com.softserve.edu04.hw.task5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first dog:");
        String name1 = scanner.next();

        System.out.println("Enter the breed of the first dog (LABRADOR, PUG, GERMAN_SHEPHERD, GOLDEN_RETRIEVER, BULLDOG):");
        String breedInput1 = scanner.next();
        Breed breed1 = Breed.valueOf(breedInput1.toUpperCase());

        System.out.println("Enter the age of the first dog:");
        int age1 = scanner.nextInt();

        Dog dog1 = new Dog(name1, breed1, age1);

        System.out.println("Enter the name of the second dog:");
        String name2 = scanner.next();

        System.out.println("Enter the breed of the second dog (LABRADOR, PUG, GERMAN_SHEPHERD, GOLDEN_RETRIEVER, BULLDOG):");
        String breedInput2 = scanner.next();
        Breed breed2 = Breed.valueOf(breedInput2.toUpperCase());

        System.out.println("Enter the age of the second dog:");
        int age2 = scanner.nextInt();

        Dog dog2 = new Dog(name2, breed2, age2);

        System.out.println("Enter the name of the third dog:");
        String name3 = scanner.next();

        System.out.println("Enter the breed of the third dog (LABRADOR, PUG, GERMAN_SHEPHERD, GOLDEN_RETRIEVER, BULLDOG):");
        String breedInput3 = scanner.next();
        Breed breed3 = Breed.valueOf(breedInput3.toUpperCase());

        System.out.println("Enter the age of the third dog:");
        int age3 = scanner.nextInt();

        Dog dog3 = new Dog(name3, breed3, age3);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("There are two or more dogs with the same name.");
        } else {
            Dog oldestDog = dog1;
            if (dog2.getAge() > oldestDog.getAge()) {
                oldestDog = dog2;
            }
            if (dog3.getAge() > oldestDog.getAge()) {
                oldestDog = dog3;
            }

            System.out.println("The oldest dog is " + oldestDog.getName() + " of breed " + oldestDog.getBreed() + ".");
        }
    }
}