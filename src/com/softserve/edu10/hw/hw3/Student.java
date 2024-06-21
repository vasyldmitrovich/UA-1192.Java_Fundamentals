package com.softserve.edu10.hw.hw3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    // Constructor
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for course
    public int getCourse() {
        return course;
    }

    // Method to print students in a specific course
    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    // Method to compare students by name
    public static Comparator<Student> compareByName() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
    }

    // Method to compare students by course
    public static Comparator<Student> compareByCourse() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
        };
    }
}
