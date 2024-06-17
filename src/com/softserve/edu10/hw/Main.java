package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        System.out.println("Plural 1:" + set1);
        System.out.println("Plural 2:" + set2);

        Set<Integer> unionSet = SetOperations.union(set1, set2);
        System.out.println("Split :" + unionSet);

        Set<Integer> intersectSet = SetOperations.intersect(set1, set2);
        System.out.println("intersect:" + intersectSet);
    }
}
