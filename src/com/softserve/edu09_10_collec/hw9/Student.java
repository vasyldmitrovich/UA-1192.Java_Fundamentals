package com.softserve.edu09_10_collec.hw9;

import java.util.Objects;

public class Student {

    private String name;
    private int group;
    private int course;
    private int grades;

    public Student(String name, int group, int grades, int course) {
        this.name = name;
        this.group = group;
        this.grades = grades;
        this.course = course;
    }

    public Student() {
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group && course == student.course && grades == student.grades && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, grades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", grades=" + grades +
                '}';
    }
}
