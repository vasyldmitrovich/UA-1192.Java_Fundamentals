package com.softserve.edu10.hw.hw1;

import java.util.HashSet;
import java.util.Set;

public class App {
    private static final String GAP = "-".repeat(40);
    private static final String NL = "\n";

    public static void main(String[] args) {// Ok
        Set<String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");
        set1.add("5");

        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("6");
        set2.add("7");
        set2.add("3");
        set2.add("2");

        union(set1, set2);
        intersect(set1, set2);
    }

    public static void union(Set set1, Set set2) {// This method not using
        Set<String> newSet = new HashSet<>(set1);
        System.out.println(GAP + NL + "SET1: " + set1 + NL + GAP);
        System.out.println(GAP + NL + "SET2: " + set2 + NL + GAP);

        if (newSet.addAll(set2)) {
            System.out.println("Set has been changed: " + newSet);
        } else System.out.println("No changes: " + newSet);
    }

    public static void intersect(Set set1, Set set2) {
        Set<String> newSet = new HashSet<>(set1);
        System.out.println(GAP + NL + "SET1: " + set1 + NL + GAP);
        System.out.println(GAP + NL + "SET2: " + set2 + NL + GAP);

        if (newSet.retainAll(set2)) {
            System.out.println("Retained newSet (SET1 + SET2) : " + newSet);
        } else System.out.println("No changes: " + newSet);
    }
}
