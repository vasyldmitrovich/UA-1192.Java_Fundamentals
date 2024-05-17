package com.softserve.edu06.hw;

public class Birds2 {
    class bird {
        public static void bird1() {
        }

        String name;

        bird(String name) {
            this.name = name;
        }

        void fly () {

        }
    }

    class FlyingBird extends bird {
        FlyingBird(String name) {
            super(name);
        }

        @Override
        void fly() {
            System.out.println(name + " can fly ");
        }
    }

    class NonFlyingBird extends bird {
        NonFlyingBird(String name) {
            super(name);
        }

        @Override
        void fly() {
            System.out.println(name + "can't fly");
        }
    }
}

