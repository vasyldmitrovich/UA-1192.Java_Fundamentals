package com.softserve.edu09.hw09.tsak1;

import java.util.*;

public class CollectionOperations {
    public void executeOperations() {
        List<Integer> myCollection = fillCollection();

        swapMinMaxElements(myCollection);

        insertRandomNumber(myCollection);

        insertZeros(myCollection);

        copyToTwoLists(myCollection);

        removeLastEvenElement(myCollection);

        removeElementFollowingMin(myCollection);
    }

    private List<Integer> fillCollection() {
        List<Integer> myCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers to fill the collection:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }
        return myCollection;
    }

    private void swapMinMaxElements(List<Integer> collection) {
    }

    private void insertRandomNumber(List<Integer> collection) {
    }

    private void insertZeros(List<Integer> collection) {
    }

    private void copyToTwoLists(List<Integer> collection) {
    }

    private void removeLastEvenElement(List<Integer> collection) {
    }

    private void removeElementFollowingMin(List<Integer> collection) {
    }
}
