package com.softserve.edu09.pt09.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>();

        heavyBoxes.add(new HeavyBox(10, "Books"));
        heavyBoxes.add(new HeavyBox(20, "Electronics"));
        heavyBoxes.add(new HeavyBox(15, "Clothes"));

        System.out.println("Initial list of HeavyBoxes:");
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box);
        }

        if (!heavyBoxes.isEmpty()) {
            heavyBoxes.get(0).weight += 1;
        }

        if (!heavyBoxes.isEmpty()) {
            heavyBoxes.remove(heavyBoxes.size() - 1);
        }

        System.out.println("\nList of HeavyBoxes after modifications:");
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box);
        }

        heavyBoxes.clear();

        System.out.println("\nList of HeavyBoxes after removing all boxes:");
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box);
        }

        if (heavyBoxes.isEmpty()) {
            System.out.println("No HeavyBoxes left.");
        }
    }
}
