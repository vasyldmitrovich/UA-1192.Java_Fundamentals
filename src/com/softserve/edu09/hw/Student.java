package com.softserve.edu09.hw;

import java.util.Arrays;

public class Student {// Ok

    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
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

    public double getAverageGrade() {
        double sum = Arrays.stream(grades).sum();
        return sum / grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", cource=" + course +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
