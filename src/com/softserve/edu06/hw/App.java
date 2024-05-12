package com.softserve.edu06.hw;

public class App {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi(),
        };

        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
            System.out.println();
        }
    }
}
