package com.softserve.edu09_10_collec.pt_09;

import java.util.ArrayList;
import java.util.List;

public class Pt_01 {
    public static void main(String[] args) {

        List<HeavyBox> box = new ArrayList<>();

        box.add(new HeavyBox(10, "Clothes"));
        box.add(new HeavyBox(5, "Computer"));
        box.add(new HeavyBox(7, "Laptop"));
        box.add(new HeavyBox(9, "Mobile_Phone"));

        for (HeavyBox boxes : box) {
            System.out.println(boxes);
        }

        System.out.println("---------------------------------------");
        System.out.println("Updated list after changing weight to 1 of the first box: ");

        box.get(0).setWeight(1);
        for (HeavyBox boxes : box) {
            System.out.println(boxes);
        }

        System.out.println("---------------------------------------");
        System.out.println("Updated list after removing the last box: ");

        box.removeLast();
        for (HeavyBox boxes : box) {
            System.out.println(boxes);
        }

        System.out.println("---------------------------------------");
        System.out.println("Remove all");

        box.removeAll(box);
        for (HeavyBox boxes : box) {
            System.out.println(boxes);
        }
    }
}

