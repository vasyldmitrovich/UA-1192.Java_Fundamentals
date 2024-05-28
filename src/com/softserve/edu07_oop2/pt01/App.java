package com.softserve.edu07_oop2.pt01;

public class App {
    public static void main(String... args) {
        Animal[] animals = {
                new Cat(),
                new Dog()
        };
        for (var animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}

