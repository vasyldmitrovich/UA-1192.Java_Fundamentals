package com.softserve.academy.edu09.pt;

import com.softserve.academy.edu08.pt.Department;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1:" +
                "        Create a dynamic array containing objects of the HeavyBox class which includes int weight\n" +
                "and String contents fields. Output its contents using for-each loop.\n" +
                "• Change the weight of the first box by 1.\n" +
                "• Remove the last box.\n" +
                "• Output result to the console. Remove all boxes and output result to the console.\n");

        ArrayList<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10, "Books"));
        boxes.add(new HeavyBox(20, "Clothes"));
        boxes.add(new HeavyBox(30, "Tools"));

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        HeavyBox firstBox = boxes.get(0);
        firstBox.setWeight(firstBox.getWeight() + 1);

        boxes.remove(boxes.size() - 1);

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.clear();

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
    }

    public static void task2() {
        System.out.println("Task 2:" +
                "Suppose, the user enters a set of numbers as a single string \"1, 2, 3, 4, 4, 5, 6, 6, 7, 8\" from\n" +
                        "the console (can be other numbers):\n" +
                        "• Remove of duplicate elements in a string.\n" +
                        "• Output the result to the console.\n");

        String numbers = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        System.out.println("Input:  " + numbers);
        List<String> numberList = Arrays.asList(numbers.split(", "));
        Set<String> numberSet = new LinkedHashSet<>(numberList);
        String uniqueNumbers = numberSet.stream().collect(Collectors.joining(", "));
        System.out.println("Output: " + uniqueNumbers);
    }

    public static void task3() {
        System.out.println("Task 2:" +
                " In main() method declare a collection myCollection of 10 integers and fill it (from the\n" +
                "console or random):\n" +
                "• Find and save in list newCollection all positions of element more than 5 in the\n" +
                "collection. Output newCollection to the console;\n" +
                "• Remove from collection myCollection elements, which are greater then 20. Output the\n" +
                "result\n" +
                "• Insert elements 1, -3, -4 in positions 2, 8, 5. Output the result in the format: “position –\n" +
                "xxx, value of element – xxx”\n" +
                "• Sort and print collection.\n");
        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(30));
        }
        System.out.println("Initial collection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println("Positions of elements more than 5: " + newCollection);

        myCollection.removeIf(n -> n > 20);
        System.out.println("After removing elements greater than 20: " + myCollection);

        myCollection.add(2, 1);
        if (myCollection.size() > 8) {
            myCollection.add(8, -3);
        } else {
            myCollection.add(-3);
        }
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);

        System.out.println("Sorted collection: " + myCollection);
    }
}
