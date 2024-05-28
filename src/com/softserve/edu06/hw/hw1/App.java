package com.softserve.edu06.hw.hw1;

public class App {
    public static void main(String[] args) {// Nice very nice
        Bird[] bird = {
                new Swallow(true, true, true, "Swallow"),
                new Eagle(true, true, true, "Eagle"),
                new Penguin(true, true, false, "Penguin"),
                new Kiwi(false, true, false, "Kiwi"),
        };
        for (var i : bird) {
            i.getInfo();
        }
    }
}




