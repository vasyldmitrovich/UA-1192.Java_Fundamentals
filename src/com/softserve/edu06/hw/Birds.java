package com.softserve.edu06.hw;

public class Birds {

    abstract class bird {// What is that this is not correct
        public String name;// Why public?

        public static void bird() {
        }
        private boolean feathers;
        private boolean layEggs;

        public bird(boolean feathers, boolean layEggs){
            this.feathers = feathers;
            this.layEggs = layEggs;
        }
        public abstract void fly();
    }
}

