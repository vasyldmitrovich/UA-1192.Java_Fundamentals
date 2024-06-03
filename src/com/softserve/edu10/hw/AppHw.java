package com.softserve.edu10.hw;

import java.util.*;

public class AppHw {
    public static void main(String[] args) {// Another logic is good
        System.out.println("-".repeat(40)+"First homework"+"-".repeat(40));
        hw1();
        System.out.println("-".repeat(40)+"Second homework"+"-".repeat(40));
        hw2();
        System.out.println("-".repeat(40) + "Third homework" + "-".repeat(40));
        hw3();

    }

    private static void hw1() {
        Set<String> set1 = new HashSet<>();
        set1.add("Enot");
        set1.add("Cat");
        set1.add("Dog");

        Set<String> set2 = new HashSet<>();
        set2.add("Chicken");
        set2.add("Cat");
        set2.add("Dog");

        System.out.println("First set:" + set1);
        System.out.println("Second set:" + set2);

        Set<String> set3 = union(set1, set2);
        System.out.println("Result operation of union two sets " + set3);

        Set<String> set4 = intersect(set1, set2);
        System.out.println("Result operation of intersect two sets " + set4);
    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> finalSet = new HashSet<>(set1);
        finalSet.addAll(set2);
        return finalSet;
    }

    private static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> finalSet = new HashSet<>(set1);
        finalSet.retainAll(set2);
        return finalSet;
    }

    private static void hw2() {
        Map<String, String> personMap = createMap();
        showMap(personMap);
        checkSamesName(personMap);
        String name = "Tom";
        deleteFromMap(personMap, name);
        System.out.println("Your map after delete persons with name " + name);

        showMap(personMap);

    }

    private static void showMap(Map<String, String> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
        System.out.println("____________________________\n");

    }

    private static Map<String, String> createMap() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Downey Jr.", "Robert");
        personMap.put("Johansson ", "Scarlett");
        personMap.put("DiCaprio", "Leonardo");
        personMap.put("Lawrence", "Jennifer");
        personMap.put("Holland", "Tom");
        personMap.put("Streep", "Meryl");
        personMap.put("Pitt", "Brad");
        personMap.put("Hardy", "Tom");
        personMap.put("Depp", "Johnny");
        return personMap;
    }

    private static void deleteFromMap(Map<String, String> personMap, String name) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            if (entry.getValue().equals(name)) {
                iterator.remove();
            }
        }
    }

    private static void checkSamesName(Map<String, String> personMap) {
        Set<String> dublicateSet = new HashSet<>();
        boolean hasName = false;

        for (String firstnames : personMap.values()) {
            if (!dublicateSet.add(firstnames)) {
                hasName = true;
                break;
            }
        }
        if (hasName) {
            System.out.println("Your map have two or more people with sames name");
        } else {
            System.out.println("Your map have not two or more  people with sames name");
        }
    }

    private static void hw3() {
        List<Student> studentList = createStudentList();
        System.out.println("Created list\n" + studentList);

        System.out.println("\nStudents studying in the 2nd course");
        Student.printStudents(studentList, 2);

        Collections.sort(studentList, new Student.StudentComparatorByName().thenComparing(new Student.StudentComparatorByCourse()));
        System.out.println("\nList after sorting\n" + studentList);
    }

    private static List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Gesika", "Kalush", 2));
        studentList.add(new Student("Alice", "Monte", 3));
        studentList.add(new Student("Monika", "Simple", 4));
        studentList.add(new Student("Gretta", "Tuborg", 2));
        studentList.add(new Student("Gretta", "Tuborg", 1));
        return studentList;
    }

}

