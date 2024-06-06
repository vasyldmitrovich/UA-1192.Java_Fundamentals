package com.softserve.edu10.hw;

import java.util.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("=".repeat(20) + " Task 1 " + "=".repeat(20));
        task1();
        System.out.println("=".repeat(20) + " Task 2 " + "=".repeat(20));
        task2();
        System.out.println("=".repeat(20) + " Task 3 " + "=".repeat(20));
        task3();
    }

    public static void task1() {
        Set<String> set1 = new HashSet<>();
        set1.add("one");
        set1.add("two");
        set1.add("three");
        Set<String> set2 = new HashSet<>();
        set2.add("one");
        set2.add("two");
        set2.add("five");

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        Set<String> unionSet = union(set1, set2);
        System.out.println("Union of two sets: " + unionSet);
        Set<String> intersectSet = intersect(set1, set2);
        System.out.println("Intersection of two sets: " + intersectSet);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    public static void task2() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Stones", "John");
        personMap.put("Williams", "Robert");
        personMap.put("Fierro", "Carlo");
        personMap.put("Mill", "Harry");
        personMap.put("Jordan", "Michael");
        personMap.put("Terwilliger", "Harry");
        personMap.put("Young", "Luke");
        personMap.put("Cole", "Ashley");
        personMap.put("Hernandez", "Leo");
        personMap.put("Mussolini", "Benito");

        System.out.println("Contents of the map: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        checkNames(personMap);
        deleteName(personMap, "Leo");
        System.out.println("\n Map after removing name Leo: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    public static void checkNames(Map<String, String> personMap) {
        Set<String> dubSet = new HashSet<>();
        boolean hasName = false;
        for (String firstname : personMap.values()) {
            if (!dubSet.add(firstname)) {
                hasName = true;
                break;
            }
        }
        if (hasName) {
            System.out.println("\nThere are same names");
        } else {
            System.out.println("\nThere aren`t any same names");
        }

    }

    public static void deleteName(Map<String, String> personMap, String name) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            if (Objects.equals(entry.getValue(), name)) {
                iterator.remove();
            }
        }
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Michael", 3));
        students.add(new Student("John", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Leonardo", 2));
        students.add(new Student("Alex", 3));

        System.out.println("To get students by course, enter the course: ");
        int course = sc.nextInt();
        System.out.println("List of students on " + course + " course:");
        printStudents(students, course);
        students.sort(Student.compareByName());
        System.out.println("\nSorted list of students (by name): ");
        System.out.println(students);
        System.out.println("\nSorted list of students (by course): ");
        students.sort(Student.compareByCourse());
        System.out.println(students);
        
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }

    }

}