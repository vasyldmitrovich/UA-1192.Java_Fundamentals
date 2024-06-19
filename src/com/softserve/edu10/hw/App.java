package com.softserve.edu10.hw;

import java.util.*;

public class App {// Nice

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second homework");

        homework3();
        System.out.println("End of the third homework");
    }

    public static void homework1 () {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int randomNumber;

        for (int i = 0; i < 10; i++) {
            randomNumber = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
            set1.add(randomNumber);
        }

        System.out.println("The first set is " + set1.toString());

        for (int i = 0; i < 10; i++) {
            randomNumber = -50 + (int) (Math.random() * ((50 - (-50)) + 1));
            set2.add(randomNumber);
        }

        System.out.println("The second set is " + set2.toString());

        union(set1, set2);
        intersect(set1, set2);
    }

    public static void union (Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(s1);
        unionSet.addAll(s2);

        System.out.println("The union set is " + unionSet.toString());
    }

    public static void intersect (Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> intersectSet = new HashSet<>();

        for (Integer item : s1) {
            if (s2.contains(item)) {
                intersectSet.add(item);
            }
        }

        System.out.println("The intersect set is " + intersectSet.toString());
    }

    public static void homework2 () {
        Map <String, String> personMap = new HashMap<>();
        personMap.put("Korol", "Mykola");
        personMap.put("Stryi", "Pavlo");
        personMap.put("Burda", "Mykola");
        personMap.put("Voron", "Alisa");
        personMap.put("Gudz", "Maria");
        personMap.put("Dudka", "Orest");
        personMap.put("Zubra", "Andriy");
        personMap.put("Galyk", "Marta");
        personMap.put("Lys", "Yulia");
        personMap.put("Syla", "Iryna");

        System.out.println("Initial persons map is: " + "\n" + personMap.toString());

        checkSame(personMap);
        removeFromValue(personMap);
    }

    public static void checkSame (Map <String, String> personMap) {
        Map <String, String> sameMap = new HashMap<>();

        for (Map.Entry<String, String> item1 : personMap.entrySet()) {

            for (Map.Entry<String, String> item2 : personMap.entrySet()) {

                if (!Objects.equals(item1.getKey(), item2.getKey()) && Objects.equals(item1.getValue(), item2.getValue())) {

                    if (!sameMap.containsKey(item1.getKey()) && !sameMap.containsKey(item2.getKey())) {
                        sameMap.put(item1.getKey(), item1.getValue());
                        sameMap.put(item2.getKey(), item2.getValue());
                    }

                }

            }

        }

        if (sameMap.isEmpty()) {
            System.out.println("There are no persons with the same value");
        } else {
            System.out.println("Persons with the same first names is " + "\n" + sameMap.toString());
        }

    }

    public static void removeFromValue (Map <String, String> personMap) {
        List<String> keyList = new ArrayList<>();

        System.out.println("Enter the first name of the person you want to delete ");
        String firstName = sc.nextLine();


        for (Map.Entry<String, String> item : personMap.entrySet()) {
            if (item.getValue().equals(firstName)) {
                keyList.add(item.getKey());
            }
        }

        for (String item : keyList) {
            personMap.remove(item);
        }

        System.out.println("Persons map with deleted first name " + firstName + " is: " + "\n" + personMap.toString());
    }

    public static void homework3 () {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student());
        studentList.add(new Student("Mykola", 2));
        studentList.add(new Student("Maria", 2));
        studentList.add(new Student("Yulia", 4));
        studentList.add(new Student("Davyd", 4));

        Student.printStudents(studentList, 2);
        Student.printStudents(studentList, 4);

        sortedByNames(studentList);
        sortedByCourses(studentList);
    }

    public static void sortedByNames (List<Student> studentList) {
        studentList.sort(Student::compareByName);
        System.out.println("The list of students sorted by name is: " + "\n" + studentList.toString());
    }

    public static void sortedByCourses (List<Student> studentList) {
        studentList.sort(Student::compareByCourses);
        System.out.println("The list of students sorted by course is: " + "\n" + studentList.toString());
    }
}
