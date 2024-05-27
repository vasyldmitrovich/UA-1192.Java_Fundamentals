package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CollectionOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(50));
        }

        System.out.println("enter 10 whole numbers:");
        for (int i = 0; i < 10; i++) {
            myCollection.add(scanner.nextInt());
        }

        System.out.println("Start collection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Position elements more 5: " + newCollection);

        myCollection.removeIf(n -> n > 20);
        System.out.println("Collection after deleted elements > 20: " + myCollection);

        insertElement(myCollection, 1, 2);
        insertElement(myCollection, -3, 8);
        insertElement(myCollection, -4, 5);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("Sorted collection: " + myCollection);
    }

    private static void insertElement(List<Integer> list, int element, int position) {
        if (position >= list.size()) {
            list.add(element);
        } else {
            list.add(position, element);
        }
    }
}
