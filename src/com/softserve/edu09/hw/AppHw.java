package com.softserve.edu09.hw;

import java.util.*;

public class AppHw {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-".repeat(30) + "First homework" + "-".repeat(30));
        hW1();

        System.out.println("-".repeat(30) + "Second homework" + "-".repeat(30));
        hW2();
    }

    public static void hW1() {
        List<Integer> myCollection = generateList();
        System.out.println("Start collection: " + myCollection);

        System.out.println("Switch min max task:");
        switchMinMax(myCollection);

        System.out.println("\nInsert random three digit number before first negative task:");
        insertRandomThreeDigit(myCollection);

        System.out.println("\nInsert zero task:");
        insertZeroAfterChangeSigns(myCollection);

        System.out.println("\nCopy first k elements and reversed other task:");
        copyWithKelement(myCollection);

        System.out.println("\nDelete last even element task:");
        deleteLastEven(myCollection);

        System.out.println("\nDelete after min task:");
        delElementAfterMin(myCollection);

    }

    public static List generateList() {
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-100, 100));
        }
        return myCollection;
    }

    public static void switchMinMax(List<Integer> myCollection) {
        int maxIndex = findMax(myCollection);
        int minIndex = findMin(myCollection);

        int max = myCollection.get(maxIndex);
        int min = myCollection.get(minIndex);

        System.out.println("Max value:" + max + " at position: " + maxIndex);
        System.out.println("Min value:" + min + " at position: " + minIndex);

        myCollection.set(minIndex, max);
        myCollection.set(maxIndex, min);
        System.out.println("Modify collection: " + myCollection);
    }

    public static int findMax(List<Integer> myCollection) {
        int max = myCollection.get(0);
        int maxIndex = 0;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > max) {
                max = myCollection.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMin(List<Integer> myCollection) {
        int min = myCollection.get(0);
        int minIndex = 0;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void insertRandomThreeDigit(List<Integer> myCollection) {
        int index1 = 0;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                index1 = i;
                myCollection.add(index1, random.nextInt(100, 1000));
                break;
            }
        }

        System.out.println("Modify collection:" + myCollection);
        System.out.println("Insert value " + myCollection.get(index1) + " with index:" + index1);
    }

    public static void insertZeroAfterChangeSigns(List<Integer> myCollection) {
        for (int i = 1; i < myCollection.size(); i++) {

            int prev = myCollection.get(i - 1);
            int current = myCollection.get(i);

            if ((prev > 0 && current <= 0) || (prev < 0 && current >= 0)) {
                myCollection.add(i, 0);
                i++;                                   // Наступний елемент пропускаємо, щоб не було нескінченного цикла
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

    public static void delElementAfterMin(List<Integer> list) {
        System.out.println("Start list:" + list);
        int index = findMin(list);
        if (index == list.size() - 1) {
            System.out.println("Your minimal is the last element");
        } else {
            list.remove(index + 1);
            System.out.println("Element after the first minimum has been removed.");
        }
        System.out.println("Modified list: " + list);
        System.out.println("Index of first minimum: " + index);
    }

    public static void hW2() {
        List<Student> students = createStudents();
        System.out.println("Start list:" + students);

        System.out.println("\nPrint student whit course number 2");
        printStudent(students, 2);

        System.out.println("\nDelete student whit average grades<3");
        delStudents(students);
        System.out.println(students);
    }

    public static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pasha", "KNT-21-4", 3, new int[]{5, 4, 4, 5, 4}));
        students.add(new Student("Dima", "KNT-22-3", 2, new int[]{3, 2, 3, 1, 2}));
        students.add(new Student("Rostik", "KNT-22-2", 2, new int[]{4, 5, 4, 5, 4}));
        students.add(new Student("Vlad", "KNT-23-4", 1, new int[]{3, 3, 3, 3, 3}));
        students.add(new Student("Natali", "KNT-20-5", 4, new int[]{4, 2, 3, 1, 4}));
        return students;
    }

    public static void delStudents(List<Student> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).getAverage() < 3) {
                list.remove(i);
            } else {
                list.get(i).setCourse(list.get(i).getCourse() + 1);
            }
        }
    }

    public static void printStudent(List<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println("My name is " + students.get(i).getName() + " i'm a " + course + " year student");
            }
        }
    }

}
