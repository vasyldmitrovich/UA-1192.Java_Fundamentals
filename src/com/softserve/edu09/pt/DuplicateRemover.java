package com.softserve.edu09.pt;

import java.util.HashSet;


public class DuplicateRemover {

    public static HashSet<Integer> remove(int... args){
        HashSet<Integer> filterd = new HashSet<>();
        for (Integer argument: args) {
            filterd.add(argument);
        }
        return filterd;
    }
}
