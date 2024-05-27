package com.softserve.edu10.hw;

import java.util.Iterator;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int course;

    public Student(String firstName, String lastName, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public static void printStudents(List<Student> students) {
        Iterator<Student> iter = students.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iter = students.iterator();

        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.course == course) {
                System.out.println(student);
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int compareByName(Student student) {
        if (this.firstName.equals(student.firstName)) {
            return this.lastName.compareTo(student.lastName);
        }
        return this.firstName.compareTo(student.firstName);
    }

    public int compareByCourse(Student student) {
        return Integer.compare(this.course, student.course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                '}';
    }
}
