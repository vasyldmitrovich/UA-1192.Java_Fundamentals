package com.softserve.edu10.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private int course;

    public Student () {
        this.name = "Taras";
        this.course = 1;
    }

    public Student (String name, int course) {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> studentList, int course) {// Move to App class
        List<String> nameList = new ArrayList<>();
        Iterator<Student> iter = studentList.iterator();

        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.course == course) {
                nameList.add(student.getName());
            }
        }

        System.out.println("The list of students names who enrolled in " + course + " course" + "\n"
                + nameList.toString());
    }

    public int compareByName(Student student) {
        if (this.name.equals(student.name)) {
            return this.name.compareTo(student.name);
        } else {
            return this.name.compareTo(student.name);
        }
    }

    public int compareByCourses(Student student) {
        if (this.course == student.getCourse()) {
            return Integer.compare(this.course, student.getCourse());
        } else {
            return Integer.compare(this.course, student.getCourse());
        }
    }
}
