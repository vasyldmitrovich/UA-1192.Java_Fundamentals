package com.softserve.edu09_10_collec.hw_09;

import java.util.*;
import java.util.Scanner;

public class Hw_01 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {

        List<Integer> myCollection = ArrayList();
        System.out.println("My collection " + myCollection);

        System.out.println("The new collection with swapping of min and max value: ");
        swapMinMax(myCollection);

        System.out.println("The new collection with inserting three digit number before first negative task: ");
        insertRandomThreeDigit(myCollection);

        System.out.println("The new collection with insert zero task:");
        insertZeroAfterChangeSigns(myCollection);

        System.out.println("The list with copy first k elements and reversed other task:");
        copyWithKelement(myCollection);

        System.out.println("The list with deleting last even element task:");
        deleteLastEven(myCollection);


    }

    public static List ArrayList() {
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-100, 100));
        }
        return myCollection;
    }

    public static void swapMinMax(List<Integer> myCollection) {
        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);

        int maxNum = myCollection.indexOf(max);
        int minNum = myCollection.indexOf(min);

        myCollection.set(maxNum, min);
        myCollection.set(minNum, max);
    }

    public static void insertRandomThreeDigit(List<Integer> myCollection) {
        int index = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                index = i;
                myCollection.add(index, random.nextInt(100, 1000));
                break;
            }
        }
        System.out.println("Modify collection:" + myCollection);
    }

    public static void insertZeroAfterChangeSigns(List<Integer> myCollection) {
        for (int i = 1; i < myCollection.size(); i++) {

            int prev = myCollection.get(i - 1);
            int current = myCollection.get(i);

            if ((prev > 0 && current <= 0) || (prev < 0 && current >= 0)) {
                myCollection.add(i, 0);
                i++;
            }
        }
        System.out.println(myCollection);
    }

    public static void copyWithKelement(List<Integer> myCollection) {
        System.out.println("Enter k");
        int k = scanner.nextInt();

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        System.out.println("List with " + k + " first elements:" + list1);

        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        System.out.println("List with other elements: " + list2);

        Collections.reverse(list2);
        System.out.println("Reversed list: " + list2);
    }

    public static void deleteLastEven(List<Integer> list) {
        System.out.println("Start list: " + list);
        boolean check = true;

        for (int i = list.size() - 1; i >= 0; i--) {
            if ((list.get(i) % 2 == 0) && (list.get(i) != 0)) {
                list.remove(i);
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Has not even elements");
        }
        System.out.println("Final list:" + list);
    }
}
