package com.softserve.edu07.pt.pt1;

public class App {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Yukie", "Mixed-breed cat", "Meow", false),
                new Cat("Seymour", "Mixed-breed cat", "Meow", true),
                new Dog("Bella", "Shepherd dog", "Bark", false),
                new Dog("Пес", "Corgi dog", "Bark", true),
        };
        for (var animal : animals) {
            System.out.println(animal.getInfo());
        }
    }
}
