package com.softserve.edu10.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;

    private int course;

    public Student() {
        this.name = "";
        this.course = 0;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    public static void printStudents(List<Student> students, int course) {// Move to class App
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " " + student.getCourse());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
