package com.softserve.edu06.hw;

public class hw1 {
    public static void main() {
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
