package com.softserve.edu09.hw;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;
    private double average;

    public Student(String name, String group, int course, int[] grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
        for (int i =0; i<grades.length;i++){
            average += grades[i];
        }// Interesting
        average=average/(grades.length);
    }
    public void getName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(group, student.group) && Arrays.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group, course);
        result = 31 * result + Arrays.hashCode(grades);
        return result;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + Arrays.toString(grades) +
                ", average=" + average +
                '}';
    }
}
