package com.softserve.edu09_10_collec.pt9.pt3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
        public static void main(String[] args) {
            List<Integer> myCollection = new ArrayList<>();
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);

            // Fill myCollection with random integers between 1 and 30
            for (int i = 0; i < 10; i++) {
                myCollection.add(rand.nextInt(30) + 1);
            }

            System.out.println("Original collection: " + myCollection);

            // Find positions of elements greater than 5
            List<Integer> newCollection = new LinkedList<>();
            for (int i = 0; i < myCollection.size(); i++) {
                if (myCollection.get(i) > 5) {
                    newCollection.add(i);
                }
            }
            System.out.println("Positions of elements greater than 5: " + newCollection);

            // Remove elements greater than 20
            myCollection = myCollection.stream()
                    .filter(num -> num <= 20)
                    .collect(Collectors.toList());
            System.out.println("Collection after removing elements greater than 20: " + myCollection);

            // Insert elements 1, -3, -4 at positions 2, 8, 5 respectively
            try {
                myCollection.add(2, 1);
                System.out.println("After inserting 1 at position 2: " + myCollection);
                myCollection.add(8, -3);
                System.out.println("After inserting -3 at position 8: " + myCollection);
                myCollection.add(5, -4);
                System.out.println("After inserting -4 at position 5: " + myCollection);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("One of the positions was out of bounds.");
            }

            // Output the result in the specified format
            for (int i = 0; i < myCollection.size(); i++) {
                System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
            }

            // Sort and print the collection
            myCollection.sort(Integer::compareTo);
            System.out.println("Sorted collection: " + myCollection);
        }
    }
