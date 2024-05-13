package com.softserve.edu06.hw06.Birdfly;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            bird.fly();
            bird.printInfo();
            System.out.println();
        }
    }
}
