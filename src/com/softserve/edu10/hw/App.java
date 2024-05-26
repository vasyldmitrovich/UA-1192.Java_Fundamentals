package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("Demonstrate task 1");
        task1();
    }

    public static void task1() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(10);
        set2.add(11);
        set2.add(12);

        System.out.println("First set");
        System.out.println(set1);

        System.out.println("Second set");
        System.out.println(set2);

        Set<Integer> united = union(set1, set2);

        System.out.println("United set");
        System.out.println(united);

        Set<Integer> intersected = intersect(set1, set2);

        System.out.println("Intersected set");
        System.out.println(intersected);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }
}
