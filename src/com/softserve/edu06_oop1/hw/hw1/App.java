package com.softserve.edu06_oop1.hw.hw1;


public class App {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        for (Bird bird : birds) {
            bird.fly();
            System.out.println(bird);
        }
    }
}
