package com.softserve.edu09_10_collec.pt_09;

import java.util.*;


public class Pt_03 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String... args) {

        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Please, enter a number ");
            myCollection.add(scan.nextInt());
        }

        System.out.println("My collection " + myCollection);

        List<Integer> newCollection = new ArrayList<>();

        for (int number : myCollection) {
            if (number > 5) {
                newCollection.add(number);
            }
        }
        System.out.println("The list of numbers more than 5: " + newCollection);

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > 20) {
                iterator.remove();
            }
        }
        System.out.println("The list of numbers no more than 20: " + myCollection);

        insertValueCheck(myCollection, 2, 1);
        insertValueCheck(myCollection, 5, -4);
        insertValueCheck(myCollection, 8, -3);
        System.out.println("The new collection with insered value " + myCollection);

        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted collection:\n" + myCollection);

    }

    public static void insertValueCheck(List<Integer> list, int position, int value) {
        if (position > list.size()) {
            list.add(value);
        } else {
            list.add(position, value);
        }
    }
}

