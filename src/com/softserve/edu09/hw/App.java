package com.softserve.edu09.hw;

import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

    }

    public static void task1() {
        List<Integer> myCollection = new LinkedList<>(new Random()
                .ints(-100, 100)
                .limit(10)
                .boxed()
                .toList());

        System.out.println("Initial collection\n");
        for (Integer i : myCollection) {
            System.out.print(i + "\t");
        }

        int min = Collections.min(myCollection);
        int max = Collections.max(myCollection);

        int minIndex = myCollection.indexOf(min);
        int maxIndex = myCollection.indexOf(max);

        myCollection.set(maxIndex, min);
        myCollection.set(minIndex, max);

        System.out.println("\nCollection after swap\n");
        for (Integer i : myCollection) {
            System.out.print(i + "\t");
        }

        int firstNegativePosition = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                firstNegativePosition = i;
                break;
            }
        }

        if (firstNegativePosition != -1) {
            myCollection.add(firstNegativePosition, new Random().nextInt(100, 999));

            System.out.println("\nCollection after add three-digit number before first negative element\n");
            for (Integer i : myCollection) {
                System.out.print(i + "\t");
            }
        } else {
            System.out.println("\nNo negative numbers\n");
        }

        for (int i = 0; i < myCollection.size(); i++) {
            if (i == myCollection.size() - 1) {
                break;
            }
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);
            if ((current > 0 && next < 0)  || (current < 0 && next > 0)) {
                myCollection.add(i + 1, 0);
            }
        }

        System.out.println("\nCollection after add zeros between elements with different signs\n");
        for (Integer i : myCollection) {
            System.out.print(i + "\t");
        }

        int k = myCollection.size() / 2;

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k - 1));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k - 1, myCollection.size()));
        Collections.reverse(list2);

        System.out.println("\nFirst part of collection in direct order\n");
        for (Integer i : list1) {
            System.out.print(i + "\t");
        }

        System.out.println("\nSecond part of collection in reverse order\n");
        for (Integer i : list2) {
            System.out.print(i + "\t");
        }

        int lastEvenElementIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenElementIndex = i;
            }
        }

        if (lastEvenElementIndex != -1) {
            myCollection.remove(lastEvenElementIndex);
            System.out.println("\nCollection after removing even element\n");
            for (Integer i : myCollection) {
                System.out.print(i + "\t");
            }
        } else {
            System.out.println("\nNo even numbers\n");
        }

        min = Collections.min(myCollection);
        minIndex = myCollection.indexOf(min);

        if (minIndex != myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        }

        System.out.println("\nCollection after removing element witch next after min\n");
        for (Integer i : myCollection) {
            System.out.print(i + "\t");
        }
    }

    public static void task2() {
        List<Student> students = new LinkedList<>(List.of(
                new Student("Alex", "ipz", 2, new int[] {1, 2, 3, 4, 5}),
                new Student("Victoria", "kn", 1, new int[] {2, 3, 3, 4, 5}),
                new Student("John", "ki", 2, new int[] {5, 5, 5, 5, 5}),
                new Student("Julia", "ipz", 4, new int[] {3, 2, 3, 4, 3}),
                new Student("Kate", "kn", 4, new int[] {1, 1, 1, 1, 1})
        ));

        List<Student> transferredToNextCourse = checkAvgGrades(students);

        System.out.println("\nStudents after check avg grades\n");
        for (Student student : transferredToNextCourse) {
            System.out.println(student);
        }

        printStudents(transferredToNextCourse, 3);
    }

    public static List<Student> checkAvgGrades(List<Student> students) {

        List<Student> copiedStudents = new LinkedList<>(students);

        for (Student student : copiedStudents) {

            int avg = Arrays.stream(student.getGrades()).sum() / student.getGrades().length;

            if (avg < 3) {
                copiedStudents.remove(student);
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }

        return copiedStudents;
    }

    public static void printStudents(List<Student> students, int course) {

        List<Student> enrolledStudents = students.stream().filter(v -> v.getCourse() == course).toList();

        System.out.println("\nStudents which have enrolled to " + course + " course\n");

        for (Student student : enrolledStudents) {
            System.out.println(student);
        }

    }
}
