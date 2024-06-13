package com.softserve.edu10.hw;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }



    public static int compareByName(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }

    // Method to compare students by course
    public static int compareByCourse(Student s1, Student s2) {// Nice
        return Integer.compare(s1.getCourse(), s2.getCourse());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
