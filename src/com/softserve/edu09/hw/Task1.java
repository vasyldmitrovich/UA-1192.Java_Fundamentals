package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1 {// Ok

    public static void main(String[] args) {
        ArrayList<Integer>
                myCollection = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) { //

            myCollection.add(rand.nextInt(201) - 100); //
        }
        System.out.println("Original collection: " + myCollection);

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));

        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("After Swapping max and min :" + myCollection);

        int randomThreeDigit = rand.nextInt(900) + 100; //

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) < 0) {

                myCollection.add(i, randomThreeDigit);

                break;
            }
        }

        System.out.println("After inserting random three-digit number: " + myCollection);

        for (int i = 1; i < myCollection.size(); i++) {
            if ((myCollection.get(i) >= 0 && myCollection.get(i - 1) < 0) || (myCollection.get(i) < 0 && myCollection.get(i) < 0 && myCollection.get(i - 1) >= 0)) {
                myCollection.add(i, 0);
                i++;
            }
        }
        System.out.println("After inserting zeros: " + myCollection);


        int k = 7;

        ArrayList<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));

        ArrayList<Integer> list2 = new ArrayList<>(myCollection.subList(0, myCollection.size()));

        Collections.reverse(list2);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);


        boolean evenFound = false;

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {

                myCollection.remove(i);

                evenFound = true;

                break;
            }
        }

        if (!evenFound) {
            System.out.println(" No even element found: ");
        } else {
            System.out.println("After removing last even element: " + myCollection);
        }

        int minElementIndex = myCollection.indexOf(Collections.min(myCollection));

        if (minElementIndex < myCollection.size() - 1) {
            myCollection.remove(minElementIndex + 1);
        }
        System.out.println("After removing element after first minimum: " + myCollection);

    }
}
