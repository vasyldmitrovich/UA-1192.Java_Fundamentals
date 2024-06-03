package com.softserve.edu10.hw;

import java.util.*;

public class App {
    public static void main(String[] args) {// Ok
        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

        System.out.println("Demonstrate task 3");
        task3();
    }

    public static void task1() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(10);
        set2.add(11);
        set2.add(12);

        System.out.println("First set");
        System.out.println(set1);

        System.out.println("Second set");
        System.out.println(set2);

        Set<Integer> united = union(set1, set2);

        System.out.println("United set");
        System.out.println(united);

        Set<Integer> intersected = intersect(set1, set2);

        System.out.println("Intersected set");
        System.out.println(intersected);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }

    public static void task2() {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Smith", "John");
        personMap.put("Johnson", "Emily");
        personMap.put("Williams", "Michael");
        personMap.put("Jones", "Sarah");
        personMap.put("Brown", "David");
        personMap.put("Davis", "Jessica");
        personMap.put("Miller", "Daniel");
        personMap.put("Wilson", "Laura");
        personMap.put("Moore", "Orest");
        personMap.put("Taylor", "Anna");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        List<String> values = new ArrayList<>(personMap.values());
        Set<String> set = new HashSet<>(values);

        System.out.println();

        if (set.size() == values.size()) {
            System.out.println("The map doesn't contain the same values");
        } else {
            System.out.println("The map contains the same values");
        }

        String name = "Orest";

        personMap.values().remove(name);

        System.out.println("\nMap after deleting person with name " + name);
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void task3() {
        List<Student> students = new ArrayList<>(List.of(
                new Student("John Doe", 1),
                new Student("Emily Johnson", 2),
                new Student("Michael Williams", 1),
                new Student("Sarah Jones", 3),
                new Student("David Brown", 2)
        ));


        System.out.println("Students in course 1:");
        Student.printStudents(students, 1);

        students.sort(Student.compareByName());
        System.out.println("Students sorted by name:");
        students.forEach(System.out::println);

        students.sort(Student.compareByCourse());
        System.out.println("Students sorted by course:");
        students.forEach(System.out::println);
    }
}
