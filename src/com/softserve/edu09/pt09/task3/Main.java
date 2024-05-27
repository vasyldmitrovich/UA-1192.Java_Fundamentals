package com.softserve.edu09.pt09.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {// Nice
        List<Integer> myCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers to fill the collection:");
        for (int i = 0; i < 10; i++) {
            myCollection.add(scanner.nextInt());
        }

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of elements more than 5: " + newCollection);

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }
        System.out.println("Collection after removing elements greater than 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println("Insertion results:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("Sorted collection: " + myCollection);
    }
}
