package com.softserve.edu10.hw.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrew", 1));
        students.add(new Student("Vasyl", 3));
        students.add(new Student("Ivan", 2));
        students.add(new Student("David", 1));
        students.add(new Student("Dmytro", 3));

        System.out.println("Sorted by name:");
        Collections.sort(students, Student.compareByName());
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        System.out.println("\nSorted by course:");
        Collections.sort(students, Student.compareByCourse());
        for (Student student : students) {
            System.out.println(student.getName() + " - Course " + student.getCourse());
        }

        System.out.println("\nStudents in course 1:");
        Student.printStudents(students, 1);
    }
}
