package com.softserve.academy.edu10.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public static Comparator<Student> CourseComparator = new Comparator<Student>() {// Ok but should start from lower case
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getCourse(), s2.getCourse());
        }
    };
}