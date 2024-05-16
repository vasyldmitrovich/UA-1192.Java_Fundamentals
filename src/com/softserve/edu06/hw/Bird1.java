package com.softserve.edu06.hw;

class Bird1 {
    public static void bird1() {
    }

        String name;

        Bird1(String name) {
            this.name = name;
        }

        void fly () {

        }
    }

    class FlyingBird extends Bird1 {
        FlyingBird(String name) {
            super(name);
        }

        @Override
        void fly() {
            System.out.println(name + " can fly ");
        }
    }

    class NonFlyingBird extends Bird1 {
        NonFlyingBird(String name) {
            super(name);
        }

        @Override
        void fly() {
            System.out.println(name + "can't fly");
        }
    }



