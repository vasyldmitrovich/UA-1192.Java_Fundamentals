package com.softserve.edu07.pt;

import java.util.Arrays;

public class Task71 {// Good
/*
    Create an interface called Animal with methods voice() and feed(). Create two classes
    Cat and Dog, which implement this interface. In main() method create an array of Animal
    and add some Cats and Dogs to it. Call voice() and feed() method for all of it.
 */

    public static void execute(){
        Animal[] pets = new Animal[5];

        for(int i =0; i< pets.length; i++){

            if(i%2 == 0 ){
                pets[i] = new Cat();
            }else {
                pets[i] = new Dog();
            }
        }

        Arrays.stream(pets).forEach(animal -> System.out.println("Hello my pet! " + animal.voice() + ". It is time to eat! " + animal.feed()));
    }

}
