package com.softserve.edu09.pt;

import java.util.*;

public class AppPt {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("-".repeat(30) + "First task" + "-".repeat(30));
        pt1();
        System.out.println("-".repeat(30) + "Second task" + "-".repeat(30));
        pt2();
        System.out.println("-".repeat(30) + "Third task" + "-".repeat(30));
        pt3();

    }

    public static void pt1() {
        System.out.println("Enter the number of boxes ");
        int n = scanner.nextInt() - 1;
        List<HeavyBox> heavyBoxList = createList(n);

        System.out.println("Your created list:");
        showList(heavyBoxList);

        heavyBoxList.get(0).setWeight(100);
        System.out.println("Your list after changed weight in first box:");
        showList(heavyBoxList);

        System.out.println("Your list without last box:");
        heavyBoxList.remove(heavyBoxList.size() - 1);
        showList(heavyBoxList);

        System.out.println("Your list after clear:");
        heavyBoxList.clear();
        showList(heavyBoxList);
    }

    public static List<HeavyBox> createList(int n) {
        List<HeavyBox> heavyBoxList = new ArrayList(n);
        for (int i = 0; i <= n; i++) {
            heavyBoxList.add(new HeavyBox());
        }
        return heavyBoxList;
    }

    public static void showList(List<HeavyBox> list) {
        for (HeavyBox box : list) {
            System.out.println(box);
        }

        System.out.println();
    }

    public static void pt2() {
        System.out.println("Enter numbers separated by commas");
        scanner.nextLine();
        String value = scanner.nextLine();

        String[] arr = value.split(",");
        System.out.println("The array is created:\n" + Arrays.toString(arr));

        Set<String> set = new HashSet<>();
        for (String numb : arr) {
            set.add(numb);
        }
        System.out.println("Numbers without repetitions: " + set);
    }

    public static void pt3() {
        List<Integer> myCollection = createRandomCollection();
        List<Integer> newCollection = createFiveIndexCollection(myCollection);

        System.out.println("Generated collection:\n" + myCollection);
        System.out.println("New collection with index numbers>5\n" + newCollection);

        deleteNumbersAfter20(myCollection);
        System.out.println("Collection without number>20:\n" + myCollection);

        //додаємо таку перевірку для того, щоб не було виходів за межі колекції
        insertValueCheck(myCollection, 2, 1);
        insertValueCheck(myCollection, 5, -4);
        insertValueCheck(myCollection, 8, -3);

        System.out.println("Final collection:");
        System.out.println(myCollection);
        show(myCollection);

        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted collection:\n" + myCollection);
    }

    /* оскільки після видалння з колекції лишніх значень
     * може індекс вийти за розмір колекції, робимо перевірку.*/
    public static void insertValueCheck(List<Integer> list, int position, int value) {
        if (position > list.size()) {
            list.add(value);
        } else {
            list.add(position, value);
        }
    }

    public static List<Integer> createFiveIndexCollection(List<Integer> list) {
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                newCollection.add(i);
            }
        }
        return newCollection;
    }

    public static List<Integer> createRandomCollection() {
        List<Integer> myCollection = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-10, 40));
        }
        return myCollection;
    }

    public static void deleteNumbersAfter20(List<Integer> myCollection) {
        int index = 0;

        while (index < myCollection.size()) {
            if (myCollection.get(index) > 20) {
                myCollection.remove(index);
            } else {
                index++;
            }
        }
    }

    public static void show(List<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i +
                    " value of element - " + myCollection.get(i));
        }
    }
}

