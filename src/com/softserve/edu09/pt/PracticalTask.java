package com.softserve.edu09.pt;

import java.util.*;

public class PracticalTask {

    public void task1() {


        //create arrayList
        Utils.create();

        //Output contents using for-each loop.
        System.out.println("Original array: ");
        Utils.printArray();

        //Change the weight of the first box by 1
        Utils.getHeavyBox().get(0).setWeight(1);

        //Remove the last box.
        Utils.getHeavyBox().removeLast();

        //Output result
        System.out.println("Array after operations: ");
        Utils.printArray();

        //Remove all boxes
        Utils.getHeavyBox().clear();
        System.out.println("Array after all removes: ");
        Utils.printArray();
    }

    public void task2() {
        String s = Utils.getNumber("Enter number");

        //Make array
        String[] lines = s.split(",");


        //Create list of strings
        LinkedList<String> list;
        list = new LinkedList<>(Arrays.asList(lines));


        //Implement LinkedHashSet to remove duplicates
        Set<String> setList = new LinkedHashSet<>(list);
        System.out.println(setList);
    }

    public void task3() {

        //create array of 10 integers by console
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Utils.getNumber("Enter number", true);
        }

        //create list myCollection and copy numbers from array
        ArrayList<Integer> myCollection = new ArrayList<>();
        Collections.addAll(myCollection, arr);
        System.out.println("myCollection is: " + myCollection);

        //create newCollection and add numbers pos >5
        ArrayList<Integer> newCollection = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(index);
            }
            index++;
        }
        System.out.println("newCollection is: " + newCollection);

        //Remove from collection myCollection elements, which are greater then 20
        for (int i = 0; i < myCollection.size(); ) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("myCollection after remove: " + myCollection);

        //Insert elements 1, -3, -4 in positions 2, 8, 5.
        LinkedList<Integer> myCollectList = new LinkedList<>();
        myCollectList.addAll(myCollection);
        myCollectList.add(2, 1);
        myCollectList.add(8, -3);
        myCollectList.add(5, -4);
        System.out.println("myCollection after add: " + myCollectList);
    }
}

