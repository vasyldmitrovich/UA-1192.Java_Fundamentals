package com.softserve.edu09.hw09.task2;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private List<Double> grades;

    public Student(String name, int group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public List<Double> getGrades() {
        return grades;
    }

    public double calculateGPA() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}
