package com.softserve.edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class SetCombiner{


    public static <T> Set<T> union(Set<T> set1, Set<T> set2){

        if(set1 == null && set2 == null) return new HashSet<>();
        else if (set1 == null) return set2;
        else if (set2 == null) return set1;

        Set<T> united = new HashSet<>(set1);
        united.addAll(set2);

        return united;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){

        if(set1 == null || set2 == null) return new HashSet<>();

        Set<T> intersection = new HashSet<>(set1);
        set1.forEach(element -> {
            if(!set2.contains(element)){
                intersection.remove(element);
            }
        });

        return intersection;
    }

}
