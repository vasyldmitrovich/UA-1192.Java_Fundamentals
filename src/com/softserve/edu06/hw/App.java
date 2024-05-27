package com.softserve.edu06.hw;

public class App {
    public static void main(String[] args) {// In this class i do not see your homework why you do not call your tasks here?
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
