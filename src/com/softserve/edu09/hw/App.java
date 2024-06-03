package com.softserve.edu09.hw;

import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {// All is good
        task1();
        task2();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myCollection = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter integer number " + (i + 1) + ":");
            int num = sc.nextInt();
            myCollection.add(num);
        }
        System.out.println("myCollection: " + myCollection);

        swapMinAndMax(myCollection);
        System.out.println("myCollection after swap min and max: " + myCollection);

        addRandomBeforeFirstNegative(myCollection);
        insertZeroBetweenDiffSigns(myCollection);
        System.out.println("With added zero between diff signs: " + myCollection);

        System.out.println("Enter the K (1-10): ");
        int k = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        copyElementsFromCollection(myCollection, k, list1, list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        removeLastEvenElement(myCollection);
        System.out.println("myCollection after removing last even element: " + myCollection);
        removeFollowingFirstMin(myCollection);


    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "IT101", 1, new int[]{4, 5, 3, 4, 4, 3, 3, 5}));
        students.add(new Student("Mike", "IT201", 2, new int[]{3, 3, 2, 4, 2, 3, 3, 3}));
        students.add(new Student("Jake", "IT301", 3, new int[]{2, 2, 3, 3, 3, 2, 5, 3}));
        students.add(new Student("Daniel", "IT201", 2, new int[]{2, 3, 5, 4, 3, 3, 4, 5}));
        students.add(new Student("Bill", "IT401", 4, new int[]{4, 5, 2, 2, 3, 5, 5, 3}));
        students.add(new Student("Richard", "IT401", 4, new int[]{4, 2, 3, 3, 4, 5, 5, 3}));
        students.add(new Student("Frank", "IT301", 3, new int[]{2, 2, 3, 2, 4, 5, 4, 3}));
        students.add(new Student("Ivan", "IT201", 2, new int[]{1, 2, 3, 3, 4, 4, 4, 4}));
        students.add(new Student("Jack", "IT101", 1, new int[]{4, 2, 3, 2, 2, 3, 2, 1}));
        students.add(new Student("Bruce", "IT301", 3, new int[]{4, 5, 4, 5, 5, 4, 4, 5}));
        students.add(new Student("Donald", "IT101", 1, new int[]{5, 5, 4, 4, 5, 5, 5, 5}));

        removeStudents(students);
        System.out.println("Students, that will be promoted to the next course: " + students);
        System.out.println("Enter the course to get students: ");
        int course = sc.nextInt();
        studentsInCurrentCourse(students, course);
    }


    public static void addRandomBeforeFirstNegative(ArrayList<Integer> myCollection) {
        Random rnd = new Random();
        int minNumIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (minNumIndex >= myCollection.get(i)) {
                minNumIndex = i;
                break;
            }
            minNumIndex = 0;
        }
        if (minNumIndex != 0) {
            myCollection.add(minNumIndex, rnd.nextInt(100, 999));
            System.out.println("myCollection after adding 3-digit num: " + myCollection);
        } else {
            System.out.println("There isn`t any negative number!");
        }
    }

    public static void swapMinAndMax(ArrayList<Integer> myCollection) {
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));

        int maxNum = Collections.max(myCollection);
        int minNum = Collections.min(myCollection);

        myCollection.set(minIndex, maxNum);
        myCollection.set(maxIndex, minNum);
    }

    public static void insertZeroBetweenDiffSigns(ArrayList<Integer> myCollection) {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0 || myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) {
                myCollection.add(i + 1, 0);
            }

        }
    }

    public static void copyElementsFromCollection(ArrayList<Integer> myCollection, int k, ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
    }

    public static void removeLastEvenElement(ArrayList<Integer> myCollection) {
        boolean foundLastEvenIndex = false;
        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                foundLastEvenIndex = true;
                lastEvenIndex = i;
                break;
            }
        }
        if (foundLastEvenIndex) {
            myCollection.remove(lastEvenIndex);
        } else {
            System.out.println("There isn`t any even element in the list!");
        }
    }

    public static void removeFollowingFirstMin(ArrayList<Integer> myCollection) {
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minIndex != myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
            System.out.println("myCollection after removing num following first min: " + myCollection);
        } else {
            System.out.println("Nothing have to be removed, because min element is the last!");
        }
    }

    public static void removeStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double sum = 0;
            double avgGrade = 0;
            int[] grades = student.getGrades();
            for (int grade : grades) {
                sum += grade;
                avgGrade = sum / student.getGrades().length;
            }
            if (avgGrade < 3) {
                iterator.remove();
            }
        }
    }

    public static void studentsInCurrentCourse(List<Student> students, int course) {
        System.out.println("Students on " + course + " course: ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}


