package com.softserve.edu06.hw;

public class hw1 {// Name of class
    public static void main() {// And move main method to App class
        Bird[] birds = {
                new Swallow(true, true, true, "Swallow"),
                new Eagle(true, true, true, "Eagle"),
                new Penguin(true, true, false, "Penguin"),
                new Kiwi(false, true, false, "Kiwi"),
        };

        for (var bird : birds){
            System.out.print("\n\n");
            bird.getInfo();

        }
    }
}
