package com.softserve.edu09_10_collec.hw9;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {// Ok
        List<Student> students = createStudents();
        StudentManagement studentManagement = new StudentManagement();

        // Print initial list of students
        System.out.println("Initial list of students:");
        studentManagement.printStudents(students);

        // Remove underperforming students and promote others
        studentManagement.removeUnderperformingStudents(students);

        // Print list after removal and promotion
        System.out.println("\nList of students after removal and promotion:");
        studentManagement.printStudents(students);

        // Example of printing students by course
        System.out.println("\nStudents in course 1:");
        studentManagement.printStudents(students, 1);
    }

    private static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();

        // Adding some students with their respective grades
        students.add(new Student("Alice", "Group A", 1, List.of(3, 4, 5)));
        students.add(new Student("Bob", "Group B", 2, List.of(2, 3, 4)));
        students.add(new Student("Charlie", "Group C", 3, List.of(4, 3, 3)));
        students.add(new Student("David", "Group A", 1, List.of(5, 5, 5, 5)));

        return students;
    }
}

