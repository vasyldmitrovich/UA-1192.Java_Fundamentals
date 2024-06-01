package edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class Task101 {

    public static void execute(){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(4);
        set2.add(5);
        set2.add(3);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Result of sets union: " + SetCombiner.union(set1,set2));
        System.out.println("Result of sets intersection: " + SetCombiner.intersect(set1, set2));

    }
}
