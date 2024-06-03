package com.softserve.edu09.pt.pt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {// Nive very nice

        List<Integer> myCollection = createArraylist();                                  //Created "myCollection"

        List<Integer> newCollection = greaterThanFiveArraylist(myCollection);            //Created "newCollection" with numbers > 5 from "myCollection"

        removeTwentyFromArraylist(myCollection);

        System.out.println("Changing elements in myCollection...");
        switchCollection(myCollection, 2, 1);
        switchCollection(myCollection, 5, -3);                                           //Changing elements in "myCollection"
        switchCollection(myCollection, 8, -4);
        System.out.println(myCollection);
        Collections.sort(myCollection);                                                  //Sorting "myCollection"

        System.out.println("\nSorted: " + myCollection);                                 //The final look of "myCollection"
    }

    public static List<Integer> createArraylist() {
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = RANDOM.nextInt(0, 50);
        }
        List<Integer> myCollection = new ArrayList<>(List.of(numbers));
        System.out.println("myCollection is:\n" + myCollection);
        return myCollection;
    }

    public static List<Integer> greaterThanFiveArraylist(List<Integer> arrayList) {
        List<Integer> newCollection = new ArrayList<>();                //Created new collection
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 5) {
                newCollection.add(arrayList.get(i));                 //Saving elements which are greater than 5
            }
        }
        System.out.println("newCollection with numbers greater than 5:\n" + arrayList);
        return newCollection;
    }

    public static void removeTwentyFromArraylist(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {                 //Removing elements which are greater than 20
            if (arrayList.get(i) >= 20) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println("myCollection without numbers greater than 20:\n" + arrayList);
    }

    public static void switchCollection(List<Integer> collection, int ind, int val) {
        String gap = "\n";
        if (ind > collection.size()) {
            collection.add(val);
            System.out.printf("Position %d is out of bound." +
                    " Value %d has added in the end of collection %n", ind, val);
        } else {
            collection.add(ind, val);
            System.out.printf("Position %d is: %d %n", ind, val);
        }

    }
}

