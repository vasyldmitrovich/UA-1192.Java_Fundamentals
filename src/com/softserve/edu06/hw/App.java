package com.softserve.edu06.hw;

public class App {
    public static void main(String[] args) {
        System.out.println("Start");


    }//Task1
    public class Birads {

        abstract class Bird {
            public String name;

            public static void bird() {
            }
            private boolean feathers;
            private boolean layEggs;

            public Bird(boolean feathers, boolean layEggs){
                this.feathers = feathers;
                this.layEggs = layEggs;
            }
            public abstract void fly();
        }
    }

}
