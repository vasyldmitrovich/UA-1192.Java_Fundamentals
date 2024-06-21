package com.softserve.edu09.hw.hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Integer> myCollection = new ArrayList<>();
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            myCollection.add(scanner.nextInt());
        }

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);

        int randomThreeDigit = 100 + random.nextInt(900);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomThreeDigit);
                break;
            }
        }

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) ||
                    (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }

        System.out.println("Enter k element:");
        int k = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        Integer lastEvenElement = null;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenElement = myCollection.remove(i);
                break;
            }
        }
        if (lastEvenElement == null) {
            System.out.println("No found element remove.");
        }

        int firstMinIndex = myCollection.indexOf(Collections.min(myCollection));
        if (firstMinIndex != myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
        }

        System.out.println("myCollection: " + myCollection);
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        scanner.close();
    }
}
