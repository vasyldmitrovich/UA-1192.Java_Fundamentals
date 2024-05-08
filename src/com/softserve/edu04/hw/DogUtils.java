package com.softserve.edu04.hw;

import java.io.InputStream;
import java.util.Scanner;

public class DogUtils {

    private static final Scanner SC = App.SC;

    public static Dog input() {
        System.out.print("Input dog's name: ");
        String name = SC.nextLine();
        System.out.print("Input dog's age: ");
        int age = Integer.parseInt(SC.nextLine());
        System.out.print("Input dog's breed: ");
        Breed breed;
        do {
            breed = Breed.of(SC.nextLine());
            if (breed == null) {
                System.out.print("Invalid breed. Try again: ");
            }
        } while (breed == null);

        return new Dog(name, age, breed);
    }

    public static Dog getOldest(Dog... dogs) {
        Dog oldest = dogs[0];
        for (Dog dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
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

}
