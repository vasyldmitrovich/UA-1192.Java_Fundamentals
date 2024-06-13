package com.softserve.edu09_10_collec.hw10.hw1;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        // Create two pre-filled sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // Add elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Compute and print union of set1 and set2
        Set<Integer> unionSet = UnionIntersection.union(set1, set2);
        System.out.println("Union of set1 and set2: " + unionSet);

        // Compute and print intersection of set1 and set2
        Set<Integer> intersectionSet = UnionIntersection.intersect(set1, set2);
        System.out.println("Intersection of set1 and set2: " + intersectionSet);
    }
}
