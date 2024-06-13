package com.softserve.edu09_10_collec.hw10.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 1));
        students.add(new Student("David", 2));
        students.add(new Student("Eve", 3));

        // Display original list of students
        System.out.println("Original list of students:");
        printStudents(students);

        // Sort students by name using StudentComparator.CompareByName
        Collections.sort(students, new StudentComparator.CompareByName());
        System.out.println("\nStudents sorted by name:");
        printStudents(students);

        // Sort students by course using StudentComparator.CompareByCourse
        Collections.sort(students, new StudentComparator.CompareByCourse());
        System.out.println("\nStudents sorted by course:");
        printStudents(students);
    }

    // Method to print list of students
    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

