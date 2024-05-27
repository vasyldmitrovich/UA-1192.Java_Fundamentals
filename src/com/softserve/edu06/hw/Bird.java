package com.softserve.edu06.hw;

abstract class Bird {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    abstract void fly();
}

class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(name + " (Sparrow) is flying short distances.");
    }
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(name + " (Eagle) is soaring high in the sky.");
    }
}

class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(name + " (Penguin) cannot fly but swims very well.");
    }
}

 class Main {// Move to file App.java not here
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];

        // Додавання різних типів птахів до масиву
        birds[0] = new Sparrow("Jack");
        birds[1] = new Eagle("Eddie");
        birds[2] = new Penguin("Pingu");

        // Виклик методу fly() для кожного птаха та виведення інформації
        for (Bird bird : birds) {
            System.out.println("Bird Name: " + bird.name);
            bird.fly();
        }
    }
}