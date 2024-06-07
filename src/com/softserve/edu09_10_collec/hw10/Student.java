package com.softserve.edu09_10_collec.hw10;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class Student {

    private String name;
    private int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }

    public static void printStudents(ArrayList<Student> students, int course ){

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }

    }

    public static Comparator<Student> compareByName() {// Ok
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
    }


    public static Comparator<Student> compareByCourse() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
        };
    }
}
