package com.softserve.edu09.pt.pt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> myCollection = new ArrayList<>();
            System.out.println("Enter 10 integers:");
            for (int i = 0; i < 10; i++) {
                myCollection.add(scanner.nextInt());
            }

            ArrayList<Integer> newCollection = new ArrayList<>();
            for (int i = 0; i < myCollection.size(); i++) {
                if (myCollection.get(i) > 5) {
                    newCollection.add(i);
                }
            }

            myCollection.removeIf(element -> element > 20);

            System.out.println("After removing elements greater than 20: " + myCollection);

            try {
                myCollection.add(2, 1);
                myCollection.add(8, -3);
                myCollection.add(5, -4);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds while inserting elements. Adjusting to fit the list size.");
                while (myCollection.size() < 9) {
                    myCollection.add(0);
                }
                myCollection.add(2, 1);
                myCollection.add(8, -3);
                myCollection.add(5, -4);
            }

            // Output the result in the specified format
            System.out.println("myCollection after inserting elements:");
            for (int i = 0; i < myCollection.size(); i++) {
                System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
            }

            // Sort and print the collection
            Collections.sort(myCollection);
            System.out.println("Sorted myCollection: " + myCollection);

            // Close the scanner
            scanner.close();
        }
    }
