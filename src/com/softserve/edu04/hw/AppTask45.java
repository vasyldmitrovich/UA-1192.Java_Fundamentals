package com.softserve.edu04.hw;

import java.util.HashSet;
import java.util.Set;

public class AppTask45 {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Boss", Breed.PIT_BULL, 4);
        dogs[1] = new Dog("Chmonya", Breed.CHIHUAHUA, 2);
        dogs[2] = new Dog("Ice", Breed.GERMAN_SHEPHERD, 5);

        Set<String> names = new HashSet<>();
        Dog oldestDog = dogs[0];

        for (int i = 0; i < 3; i++) {
            names.add(dogs[i].getName());
            if(dogs[i].getAge() > oldestDog.getAge()){
                oldestDog = dogs[i];
            }
        }
        if(dogs.length == names.size()){
            System.out.println("All dogs` names are original");
        } else {
            System.out.println("Some dogs have the same names");
        }

        System.out.printf("The oldest dog is %s, he is %d years old", oldestDog.getName(), oldestDog.getAge());

    }
}
