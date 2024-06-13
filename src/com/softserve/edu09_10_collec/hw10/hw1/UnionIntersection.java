package com.softserve.edu09_10_collec.hw10.hw1;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {

    // Method to compute union of two sets
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    // Method to compute intersection of two sets
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}

