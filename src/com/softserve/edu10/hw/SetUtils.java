package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {

    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static <E> Set<E> intersect(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>();

        for (E element : set1) {
            if (set2.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
