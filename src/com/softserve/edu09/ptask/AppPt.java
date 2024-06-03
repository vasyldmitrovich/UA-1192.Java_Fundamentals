package com.softserve.edu09.ptask;

import java.util.*;

public class AppPt {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        List<HeavyBox> box = new ArrayList<>();

        box.add(new HeavyBox(10, "Clothes"));
        box.add(new HeavyBox(20, "Toys"));
        box.add(new HeavyBox(15, "Books"));

        for (HeavyBox boxes : box) {
            System.out.println("Weight: " + boxes.getWeight() + ". Contents fields: " + boxes.getContents_fields());
        }

        box.get(0).setWeight(1);
        box.removeLast();

        for (HeavyBox boxes : box) {
            System.out.println("Weight: " + boxes.getWeight() + ". Contents fields: " + boxes.getContents_fields());
        }

        box.removeAll(box);

        for (HeavyBox boxes : box) {
            System.out.println("Weight: " + boxes.getWeight() + ". Contents fields: " + boxes.getContents_fields());
        }
    }

    public static void task2() {
        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + i);
            String inputNumber = String.valueOf(scan.nextInt());
            numbers.add(inputNumber);
        }

        System.out.println("Entered numbers: " + numbers);

        Set<String> sameNumbers = new HashSet<>(numbers);

        List<String> differentNumbers = new ArrayList<>(sameNumbers);

        System.out.println("List without duplicate elements: " + differentNumbers);
    }

    public static void task3() {
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter numbers " + i);
            myCollection.add(scan.nextInt());
        }

        System.out.println("List: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();

        for (int number : myCollection) {
            if (number > 5) {
                newCollection.add(number);
            }
        }

        System.out.println("List of elements more than 5: " + newCollection);

        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number < 20) {
                iterator.remove();
            }
        }

        System.out.println("List of elements greater than 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position " + i + ". Value of element: " + myCollection.get(i));
        }

        Collections.sort(myCollection);

        System.out.println("Sorted collection:" + myCollection);
    }
}






