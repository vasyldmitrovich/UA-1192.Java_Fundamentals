package com.softserve.edu09.pt.pt1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();

        heavyBoxes.add(new HeavyBox(10, "Books"));
        heavyBoxes.add(new HeavyBox(20, "Tools"));
        heavyBoxes.add(new HeavyBox(30, "Clothes"));

        System.out.println("Original list:");
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box);
        }

        heavyBoxes.get(0).setWeight(heavyBoxes.get(0).getWeight() + 1);

        heavyBoxes.remove(heavyBoxes.size() - 1);

        System.out.println("\nAfter modifying first box and removing last box:");
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box);
        }

        heavyBoxes.clear();

        System.out.println("\nAfter removing all boxes:");
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box);
        }

        if (heavyBoxes.isEmpty()) {
            System.out.println("No boxes in the list.");
        }
    }
}
