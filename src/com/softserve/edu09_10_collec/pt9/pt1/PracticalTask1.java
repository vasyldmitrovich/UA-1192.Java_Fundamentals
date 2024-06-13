package com.softserve.edu09_10_collec.pt9.pt1;
import java.util.ArrayList;

public class PracticalTask1 {
        public static void main(String[] args) {
            // Step 1: Create a dynamic array (ArrayList) containing HeavyBox objects
            ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();

            heavyBoxes.add(new HeavyBox(10, "Books"));
            heavyBoxes.add(new HeavyBox(20, "Clothes"));
            heavyBoxes.add(new HeavyBox(30, "Toys"));

            // Step 2: Output its contents using a for-each loop
            System.out.println("Contents of heavyBoxes:");
            for (HeavyBox box : heavyBoxes) {
                System.out.println(box);
            }

            // Step 3: Change the weight of the first box by 1
            if (!heavyBoxes.isEmpty()) {
                heavyBoxes.get(0).weight += 1;
            }

            // Step 4: Remove the last box
            if (!heavyBoxes.isEmpty()) {
                heavyBoxes.remove(heavyBoxes.size() - 1);
            }

            // Step 5: Output the result to the console
            System.out.println("\nContents of heavyBoxes after modification:");
            for (HeavyBox box : heavyBoxes) {
                System.out.println(box);
            }

            // Step 6: Remove all boxes
            heavyBoxes.clear();

            // Output the result to the console
            System.out.println("\nContents of heavyBoxes after removing all boxes:");
            for (HeavyBox box : heavyBoxes) {
                System.out.println(box);
            }

            // Alternatively, check if the list is empty
            if (heavyBoxes.isEmpty()) {
                System.out.println("heavyBoxes is empty.");
            }
        }
    }
