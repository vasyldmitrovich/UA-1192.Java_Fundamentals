package com.softserve.edu09.pt;

import com.softserve.edu06.pt.Line;

import java.util.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        ArrayList<HeavyBox> heavyBoxList = new ArrayList<>();
        heavyBoxList.add(new HeavyBox(15, "Food"));
        heavyBoxList.add(new HeavyBox(20, "Drinks"));
        heavyBoxList.add(new HeavyBox(30, "Instruments"));

        System.out.println("HeavyBox consists of: ");
        for (HeavyBox box : heavyBoxList) {
            System.out.println(box);
        }

        if (!heavyBoxList.isEmpty()) {
            heavyBoxList.get(0).setWeight(1);
        }

        if (!heavyBoxList.isEmpty()) {
            heavyBoxList.remove(heavyBoxList.size() - 1);
        }
        System.out.println("\nHeavyBox after changes: ");
        for (HeavyBox box : heavyBoxList) {
            System.out.println(box);
        }

        System.out.println("\n Empty box: ");
        heavyBoxList.clear();
        for (HeavyBox box : heavyBoxList) {
            System.out.println(box);
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers with commas: ");
        String nums = sc.nextLine();

        String[] numsArray = nums.split(",");
        Set<String> uniqueSet = new HashSet<>();
        for (String num : numsArray) {
            uniqueSet.add(num);
        }

        StringJoiner join = new StringJoiner(",");
        for (String num : uniqueSet) {
            join.add(num);
        }
        String output = join.toString();
        System.out.println(output);
    }

    public static void task3() {
        Random rnd = new Random();
        List<Integer> myCollection = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(100));
        }
        System.out.println("myCollection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("newCollection: " + newCollection);

        myCollection.removeIf(num -> num > 20);
        System.out.println("myCollection after removing >20: " + myCollection);

        try {
            myCollection.add(2, 1);
            myCollection.add(8, -3);
            myCollection.add(5, -4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error (Element out of bound)");
        }

        System.out.println("myCollection with added elements: ");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        System.out.println("myCollection: " + myCollection);

    }

}
