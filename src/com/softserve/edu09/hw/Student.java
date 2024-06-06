package com.softserve.edu09.hw;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String name;
    private String group;
    private int course;
    private int [] grades;// You initialize in constructor, do not need here

    public Student () {
        this.name = "Mykola";
        this.group = "Cyber-security";
        this.course = 1;
        this.grades = new int[]{3, 4, 3, 2, 5};
    }

    public Student (String name, String group, int course, int [] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name) && group.equals(student.group) && Arrays.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group, course);
        result = 31 * result + Arrays.hashCode(grades);
        return result;
    }

    public double averageGrade () {
        double averageGrade = 0;

        for (int item : this.grades) {
            averageGrade += item;
        }

        averageGrade /= this.grades.length;
        return averageGrade;
    }
}
