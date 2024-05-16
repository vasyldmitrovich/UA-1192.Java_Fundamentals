package com.softserve.edu06.hw;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{

        };

        new Eagle("Eagle");
        new Swallow("Swallow");
        new Penguin("Penguin");
        new Kiwi("Kiwi");

        for (Bird bird : birds) {
            bird.fly();

            System.out.println(bird.name);
        }
    }
}


