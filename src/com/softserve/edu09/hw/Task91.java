package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Random;

public class Task91 {

    public static void execute(){// Good

        ArrayListOperator aop = new ArrayListOperator();
        ArrayList<Integer> myCollection = createList(10);

        System.out.println("Swap the maximum and minimum elements in the list.");
        System.out.println("Initial collection: " + myCollection);
        System.out.println("Modified collection: " + aop.swapMaxMin(myCollection));
        System.out.println();

        System.out.println("Insert a random three-digit number before the first negative element of the list.");
        System.out.println("Initial collection: " + myCollection);
        System.out.println("Modified collection: " + aop.insert3Digs(myCollection));
        System.out.println();

        System.out.println("Insert a zero between all neighboring elements of collection myCollection with different signs.");
        System.out.println("Initial collection: " + myCollection);
        System.out.println("Modified collection: " + aop.insertZero(myCollection));
        System.out.println();

        System.out.println("Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the\n" +
                "list2 in reverse order.");
        System.out.println("Initial collection: " + myCollection);
        aop.copyRev(5, myCollection);
        System.out.println();

        System.out.println("Remove the last even element in the list.");
        System.out.println("Initial collection: " + myCollection);
        System.out.println("Modified collection: " + aop.removeLastEven(myCollection));
        System.out.println();

        System.out.println("Remove the element following the first minimum from the list.");
        System.out.println("Initial collection: " + myCollection);
        System.out.println("Modified collection: " + aop.removeFollowing(myCollection));
        System.out.println();
    }

    private static ArrayList<Integer> createList(int size){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<size; i++){
            list.add(random.nextInt(-1000, 1000));
        }

        return list;
    }
}
