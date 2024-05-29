package com.softserve.edu09_10_collec.hw10;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

task1();

    }

    public static void task1(){

        Set<String> set1 = new HashSet<>();
        set1.add("Element 1");
        set1.add("Element 2");
        set1.add("Element 3");

        System.out.println("set1 =" + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("Element 4");
        set2.add("Element 5");
        set2.add("Element 6");
        set2.add("Element 2");

        System.out.println("set2 =" + set2);
        System.out.println("union =" + union(set1, set2));
        System.out.println("intersect =" + intersect(set1,  set2));

    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }


    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }
}
