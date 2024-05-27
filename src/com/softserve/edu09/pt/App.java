package com.softserve.edu09.pt;

import java.util.*;

public class App {
    public static void main(String[] args) {// All is good

        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

        System.out.println("Demonstrate task 3");
        task3();
    }

    public static void task1() {
        HeavyBox[] boxes = {
                new HeavyBox(),
                new HeavyBox(20, "Apple, Juice, Banana"),
                new HeavyBox()
        };

        List<HeavyBox> boxesList = new ArrayList<>(Arrays.asList(boxes));

        System.out.println("Initial list\n");
        for (HeavyBox box : boxesList) {
            System.out.println(box);
        }

        boxesList.get(0).setWeight(1);

        System.out.println("List with modified first element weight\n");
        for (HeavyBox box : boxesList) {
            System.out.println(box);
        }

        boxesList.remove(boxesList.size() - 1);

        System.out.println("List without last element\n");
        for (HeavyBox box : boxesList) {
            System.out.println(box);
        }

        boxesList.clear();

        System.out.println("Empty list\n");
        System.out.println(boxesList);
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers separated by commas: ");
        String numbersString = scanner.nextLine();

        String[] numbers = numbersString.replaceAll(" ", "").split(",");

        Set<String> numberSet = new HashSet<>(Arrays.asList(numbers));

        System.out.println(String.join(", ", numberSet));
    }

    public static void task3() {
        List<Integer> myCollection = new ArrayList<>(new Random()
                .ints(0, 50)
                .limit(10)
                .boxed()
                .toList());

        System.out.println("Generated collection");
        for (Integer i : myCollection) {
            System.out.print(i + "\t");
        }

        System.out.println();

        Collection<Integer> newCollection = new ArrayList<>();

        Iterator<Integer> iterator = myCollection.iterator();
        int index = 0;

        while (iterator.hasNext()) {
            int v = iterator.next();
            if (v > 5) {
                newCollection.add(index);
            }
            index += 1;
        }

        System.out.println("Positions of elements witch are greater than 5");
        for (Integer i : newCollection) {
            System.out.print(i + "\t");
        }

        myCollection.removeIf(v -> v > 20);

        System.out.println("\nCollection after removing elements greater than 20");
        for (Integer i : myCollection) {
            System.out.print(i + "\t");
        }

        try {
            myCollection.add(1, 2);
            myCollection.add(8, -3);
            myCollection.add(5, -4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nCannot add some elements to collection because it is out of bounds");
        }

        System.out.println("\nCollection after adding elements");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position " + i + ", value of element - " + myCollection.get(i));
        }

        myCollection.sort(Comparator.comparingInt(o -> o));

        System.out.println("\nCollection after sorting elements");
        for (Integer i : myCollection) {
            System.out.print(i + "\t");
        }
    }
}
