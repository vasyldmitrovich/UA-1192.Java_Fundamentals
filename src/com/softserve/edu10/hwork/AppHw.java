package com.softserve.edu10.hwork;

import java.util.*;
import java.util.HashSet;
import java.util.Set;


import static com.softserve.edu10.hwork.Student.printStudents;

public class AppHw {
    public static void main(String[] args) {// Nice, all nice
        task1();
        task2();
        task3();
    }

    public static void task1() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Set 1: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("Set 2: " + set2);

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersect: " + intersect(set1, set2));

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

        personMap.put("Rakuta", "Anastasia");
        personMap.put("Plastyn", "Alla");
        personMap.put("Popel", "Maks");
        personMap.put("Maslov", "Dima");
        personMap.put("Semonenko", "Olga");
        personMap.put("Kvitkova", "Rita");
        personMap.put("Filatov", "Orest");
        personMap.put("Odarenko", "Orest");
        personMap.put("Kim", "Ira");
        personMap.put("Logvinenko", "Kate");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        boolean sameNames = personMap.values().stream().distinct().count() < personMap.size();

        if (sameNames) {
            System.out.println("Are there at least two persons with the same first name.");
        } else {
            System.out.println("No duplicate names found.");
        }

        personMap.values().removeIf(name -> name.equals("Orest"));

        System.out.println("PersonMap after removing:");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void task3() {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Maks", 1));
        studentList.add(new Student("Poman",1));
        studentList.add(new Student("Ivan",2));
        studentList.add(new Student("Sasha",3));
        studentList.add(new Student("Pavlo",4));

        printStudents(studentList, 1);

        Collections.sort(studentList);
        System.out.println("Sorted by name:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " : Course " + student.getCourse());
        }

        Collections.sort(studentList, Student.compareByCourse());
        System.out.println("Sorted by course:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " : Course " + student.getCourse());
        }
    }
}
