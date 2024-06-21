package com.softserve.edu10.hw.hw1;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("2");
        set1.add("1");
        set1.add("3");
        set1.add("4");
        set1.add("8");

        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("7");
        set2.add("6");
        set2.add("3");
        set2.add("2");

        union(set1, set2);
        intersect(set1, set2);
    }

    public static void union(Set<String> set1, Set<String> set2) {
        Set<String> newSet = new HashSet<>(set1);
        newSet.addAll(set2);

        System.out.println("\n" + "SET1: " + set1 + "\n");
        System.out.println("\n"+ "SET2: " + set2 + "\n");

        System.out.println("Union of SET1 and SET2: " + newSet);
    }

    public static void intersect(Set<String> set1, Set<String> set2) {
        Set<String> newSet = new HashSet<>(set1);
        newSet.retainAll(set2);

        System.out.println("\n" + "SET1: " + set1 + "\n");
        System.out.println("\n" + "SET2: " + set2 + "\n");

        System.out.println("Intersection of SET1 and SET2: " + newSet);
    }
}

