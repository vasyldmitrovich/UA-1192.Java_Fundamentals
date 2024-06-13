package com.softserve.edu09_10_collec.hw9;
import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
        // Step 1: Declare collection myCollection of 10 integers and fill it
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();

        // Fill myCollection with 10 random integers between -99 and 99
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(199) - 99); // Generate random numbers from -99 to 99
        }

        System.out.println("Initial myCollection: " + myCollection);

        // Step 2: Swap maximum and minimum elements
        swapMinMax(myCollection);
        System.out.println("After swapping min and max: " + myCollection);

        // Step 3: Insert a random three-digit number before the first negative element
        insertBeforeNegative(myCollection, random.nextInt(900) + 100); // Generate random three-digit number
        System.out.println("After inserting random three-digit number before first negative: " + myCollection);

        // Step 4: Insert zero between neighboring elements with different signs
        insertZeroBetweenDifferentSigns(myCollection);
        System.out.println("After inserting zero between neighboring elements with different signs: " + myCollection);

        // Step 5: Split myCollection into list1 and list2
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        splitList(myCollection, list1, list2);
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // Step 6: Remove last even element from myCollection
        removeLastEven(myCollection);
        System.out.println("After removing last even element: " + myCollection);

        // Step 7: Remove element following first minimum (if applicable)
        removeElementFollowingMin(myCollection);
        System.out.println("After removing element following first minimum: " + myCollection);
    }

    // Method to swap the minimum and maximum elements in a list
    private static void swapMinMax(List<Integer> list) {
        if (list.isEmpty()) return;

        int minIndex = 0;
        int maxIndex = 0;
        int minValue = list.get(0);
        int maxValue = list.get(0);

        // Find min and max values and their indices
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i);
                minIndex = i;
            }
            if (list.get(i) > maxValue) {
                maxValue = list.get(i);
                maxIndex = i;
            }
        }

        // Swap min and max values
        int temp = list.get(minIndex);
        list.set(minIndex, list.get(maxIndex));
        list.set(maxIndex, temp);
    }

    // Method to insert a number before the first negative element in a list
    private static void insertBeforeNegative(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, number);
                return;
            }
        }
        // If no negative element found, add number at the end
        list.add(number);
    }

    // Method to insert zero between neighboring elements with different signs
    private static void insertZeroBetweenDifferentSigns(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) >= 0 && list.get(i + 1) < 0) || (list.get(i) < 0 && list.get(i + 1) >= 0)) {
                list.add(i + 1, 0);
                i++; // Skip the next element as we just added zero
            }
        }
    }

    // Method to split a list into two lists
    private static void splitList(List<Integer> list, List<Integer> list1, List<Integer> list2) {
        int k = Math.min(5, list.size()); // Assuming k = 5 for example
        list1.addAll(list.subList(0, k));
        list2.addAll(list.subList(k, list.size()));
        Collections.reverse(list2);
    }

    // Method to remove the last even element from a list
    private static void removeLastEven(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                System.out.println("Removed last even element");
                return;
            }
        }
        System.out.println("No even element found to remove");
    }

    // Method to remove the element following the first minimum element in a list
    private static void removeElementFollowingMin(List<Integer> list) {
        if (list.isEmpty()) return;

        int minIndex = 0;
        int minValue = list.get(0);

        // Find index of first minimum element
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i);
                minIndex = i;
            }
        }

        // Remove element following first minimum (if not last element)
        if (minIndex < list.size() - 1) {
            list.remove(minIndex + 1);
        }
    }
}
