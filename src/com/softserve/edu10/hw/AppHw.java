package com.softserve.edu10.hw;


import java.util.*;

import static com.softserve.edu10.hw.SetOperations.intersect;
import static com.softserve.edu10.hw.SetOperations.union;

public class AppHw {
    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    public static void task1() {
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        System.out.println("Set1:" + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Set2:" + set2);

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersect: " + intersect(set1, set2));

    }

    public static void task2() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Babiuk", "Svitlana");
        personMap.put("Kvitka", "Alla");
        personMap.put("Teliatnyk", "Anastasiya");
        personMap.put("Logvinenko", "Kate");
        personMap.put("Prokopets", "Olga");
        personMap.put("Zabara", "Orest");
        personMap.put("Apanasenko", "Elina");
        personMap.put("Tandyryak", "Orest");
        personMap.put("Kozak", "Solomiya");
        personMap.put("Lysenko", "Oleg");

        System.out.println("Original Map:");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Перевірка, чи є принаймні дві особи з однаковим ім'ям
        Map<String, Integer> nameCount = new HashMap<>();
        for (String firstName : personMap.values()) {
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }

        boolean hasDuplicateFirstNames = false;
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                hasDuplicateFirstNames = true;
                break;
            }
        }

        if (hasDuplicateFirstNames) {
            System.out.println("There are at least two persons with the same first name.");
        } else {
            System.out.println("There are no duplicate first names.");
        }

        // Видалення особи з ім'ям "Orest"
        personMap.values().removeIf(name -> name.equals("Orest"));

        // Виведення оновленої мапи
        System.out.println("Updated Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void task3() {
        List<Student> students = new ArrayList<>();

        // Додавання п'яти різних студентів до списку
        students.add(new Student("Ivan", 1));
        students.add(new Student("Petro", 2));
        students.add(new Student("Anna", 1));
        students.add(new Student("Maria", 3));
        students.add(new Student("Oleh", 2));

        // Виведення списку студентів, відсортованих за ім'ям
        students.sort(Student.compareByName());
        System.out.println("Students sorted by name:");
        for (Student     student : students) {
            System.out.println(student);
        }

        // Виведення списку студентів, відсортованих за курсом
        students.sort(Student.compareByCourse());
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Виведення студентів, які записані на курс 1
        Student.printStudents(students, 1);
    }
}


