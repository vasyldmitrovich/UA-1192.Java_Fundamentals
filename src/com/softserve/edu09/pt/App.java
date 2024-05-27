package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        practicalTask1();
        System.out.println("End of the first task");

        practicalTask2();
        System.out.println("End of the second task");

        practicalTask3();
        System.out.println("End of the third task");
    }

    public static void practicalTask1 () {
        List<HeavyBox> heavyBoxList = new ArrayList<>();
        System.out.println("Enter the weight for box");

        try {
            int weight = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the content in your box");
            String content = sc.nextLine();
            heavyBoxList.add(new HeavyBox(weight, content));
            heavyBoxList.add(new HeavyBox());
            heavyBoxList.add(new HeavyBox(120, "Furniture"));
            heavyBoxList.add(new HeavyBox(40, "Toys"));

            for (HeavyBox item: heavyBoxList) {
                System.out.println(item.toString());
            }

            System.out.println("Let's change the weight of the first box by 1 and remove last box");
            heavyBoxList.get(0).setWeight(heavyBoxList.get(0).getWeight() - 1);
            heavyBoxList.remove(heavyBoxList.size() - 1);


            for (HeavyBox item: heavyBoxList) {
                System.out.println(item.toString());
            }

            System.out.println("Let's remove all boxes");
            heavyBoxList.clear();

            System.out.println(heavyBoxList);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void practicalTask2 () {
        System.out.println("Enter a set of numbers in format '1, 2, 3, 4, 4...' ");
        String[] numbersArray = sc.nextLine().replace(" ", "").split(",+");
        Integer [] trueNumbers = new Integer[numbersArray.length];

        try {
            for (int i = 0; i < numbersArray.length; i++) {
                trueNumbers[i] = Integer.parseInt(numbersArray[i]);
            }

            List<Integer> numbersList = new ArrayList<>(List.of(trueNumbers));
            List<Integer> trueNumbersList = new ArrayList<>();

            for (Integer item : numbersList) {
                if (!trueNumbersList.contains(item)) {
                    trueNumbersList.add(item);
                }
            }

            System.out.println("List without duplicated values " + trueNumbersList.toString());
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public static void practicalTask3 () {
        List<Integer> myCollection = new ArrayList<>();
        int randomNumber;

        for (int i = 0; i < 10; i++) {
            randomNumber = -100 + (int) (Math.random() * ((100 - (-100)) + 1));
            myCollection.add(randomNumber);
        }

        System.out.println("Initial list of elements" + myCollection.toString());

        positionFinder(myCollection);
        elementsRemove(myCollection);
        elementsChange(myCollection);

        myCollection.sort(null);
        System.out.println("Sorted list of elements" + myCollection.toString());
    }

    public static void positionFinder (List<Integer> myCollection) {
        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println("Positions of elements, which are greater than 5 is: " + newCollection.toString());
    }

    public static void elementsRemove (List<Integer> myCollection) {
        int count = 0;

        while (count < myCollection.size()) {
            if (myCollection.get(count) > 20) {
                myCollection.remove(count);
            } else {
                count++;
            }
        }

        System.out.println("List without elements, which are greater than 20 is: " + myCollection.toString());
    }

    public static void elementsChange (List<Integer> myCollection) {
        System.out.println("Let's insert elements 1, -3, -4 in positions 2, 8, 5");

        if (myCollection.size() > 2) {
            myCollection.set(1, 2);

            if (myCollection.size() > 5) {
                myCollection.set(5, -4);

                if (myCollection.size() > 8) {
                    myCollection.set(8, -3);
                } else {
                    System.out.println("There are no 8 position in the collection");
                }

            } else {
                System.out.println("There are no 5 position in the collection");
            }

        } else {
            System.out.println("There are no 2 position in the collection");
        }

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }
    }

}
