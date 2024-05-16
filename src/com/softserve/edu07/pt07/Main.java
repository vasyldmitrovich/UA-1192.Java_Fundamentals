package com.softserve.edu07.pt07;


public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals[0] = new Cat("Whiskers");
        animals[1] = new Dog("Buddy");
        animals[2] = new Cat("Mittens");
        animals[3] = new Dog("Max");
        animals[4] = new Cat("Smokey");
        animals[5] = new Dog("Bailey");

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
