package com.softserve.edu09.pt;

import java.util.ArrayList;

class HeavyBox {
    int weight;
    String contents;

    HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{weight=" +
                weight + ", contents='" + contents +
                "'}";
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10, "Copy books"));
        boxes.add(new HeavyBox(15, "Electronics"));
        boxes.add(new HeavyBox(14, "Clothes"));
        boxes.add(new HeavyBox(560, "Weapons"));

        System.out.println("Original contents:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
        if (!boxes.isEmpty()) {
            boxes.get(0).weight = 1;
        }
        if (!boxes.isEmpty()) {
            boxes.remove(boxes.size() - 1);
        }
        System.out.println("/nAfter modifications: ");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
        boxes.clear();

        System.out.println("/nAfter clearing all boxes");
        System.out.println(boxes);
    }
}