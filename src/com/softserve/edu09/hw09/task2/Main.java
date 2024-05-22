package com.softserve.edu09.hw09.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1, 1, List.of(4.0, 3.5, 3.0)));
        students.add(new Student("Bob", 2, 1, List.of(3.2, 2.8, 3.1)));
        students.add(new Student("Charlie", 1, 2, List.of(3.8, 3.7, 3.9)));
        students.add(new Student("David", 2, 2, List.of(2.5, 3.0, 2.9)));

        removeLowPerformingStudents(students);
        printStudents(students, 1);
    }

    public static void removeLowPerformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double gpa = student.calculateGPA();
            if (gpa < 3.0) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1); // Promote to next course level
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students enrolled in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
